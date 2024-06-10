package com.msmavas.speedy.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.msmavas.speedy.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE (u.email = :identifier OR u.mobile = :identifier) AND u.password = :password")
    Optional<User> findByEmailOrMobileAndPassword(@Param("identifier") String identifier, @Param("password") String password);
	
}
