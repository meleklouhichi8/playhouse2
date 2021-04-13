package tn.playhouse2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tn.playhouse2.model.User;
import tn.playhouse2.model.UserDet;
import tn.playhouse2.repository.Userrepository;
@Service
public class UserDetService implements UserDetailsService {
	
	
	@Autowired
	private Userrepository userRepository;
		
	@Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		 User user = this.userRepository.findByUserName(userName);
		 UserDet userDet = new UserDet(user); 

		 
		 return userDet ; 
	}
}
