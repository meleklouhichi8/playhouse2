package tn.playhouse2.repository;

import org.springframework.data.repository.CrudRepository;


import tn.playhouse2.model.VerificationToken;

public interface VerificationTokenrepository extends CrudRepository<VerificationToken,Long>{
	VerificationToken findByToken(String token); 
}
