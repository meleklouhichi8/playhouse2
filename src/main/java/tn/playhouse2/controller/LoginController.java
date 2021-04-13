package tn.playhouse2.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tn.playhouse2.filter.JwtProvider;
import tn.playhouse2.requests.LoginRequest;
import tn.playhouse2.requests.LoginResponse;
import tn.playhouse2.service.UserDetService;


@RestController
@RequestMapping("/home")
public class LoginController {

	@Autowired
	private AuthenticationManager authenticationManager ;
	@Autowired
	private JwtProvider jwtProvider ; 
	@Autowired
	private UserDetService userDetailsService ; 
	
	
/*	private void authenticate(String username, String password) throws Exception {
		try {
			System.out.println("starting auth");
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			System.out.println("starting aaaaaaaa");
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}*/
	
	@PostMapping("/Login")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody LoginRequest loginRequest) throws AuthenticationException, IOException {

		// Perform the security
        Authentication authentication;
		//authenticate(loginRequest.getUsername(), loginRequest.getPassword());
        System.out.println("firststep");
        
       
            authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getUsername(),
                            loginRequest.getPassword()
                    )
            );
            System.out.println("secondstep");

   
        

		final UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getUsername());
        //System.out.println("abababa"+userDetails.getUsername());
		final String jwt = jwtProvider.generateToken(userDetails);
		
		return ResponseEntity.ok(new LoginResponse(jwt));
	}
	
	
	
}
