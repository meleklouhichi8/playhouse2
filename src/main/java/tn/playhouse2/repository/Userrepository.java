package tn.playhouse2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.playhouse2.model.User;

@Repository
public interface Userrepository extends CrudRepository<User,Long>{
	User findByUserName(String username);

    List<User> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String firstName, String lastName, String email);


}
