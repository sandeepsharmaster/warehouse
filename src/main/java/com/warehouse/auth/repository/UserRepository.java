package com.warehouse.auth.repository;

import com.warehouse.auth.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    
	/*@Query(“SELECT f FROM User f WHERE LOWER(f.username) = LOWER(:name)”)
	User retrieveByName(@Param(“name”) String name);*/
}
