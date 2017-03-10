package com.warehouse.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warehouse.auth.model.User;

public interface CSVScannerRepository extends JpaRepository<User, Long> {
   
    
	
}
