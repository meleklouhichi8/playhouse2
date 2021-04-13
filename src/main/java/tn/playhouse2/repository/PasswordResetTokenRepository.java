package tn.playhouse2.repository;

import org.springframework.data.repository.CrudRepository;

import tn.playhouse2.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetToken,Long> {
	PasswordResetToken findByToken(String token);
}
