package com.warehouse.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warehouse.auth.model.InvardShipment;

public interface ShipmentRepository extends JpaRepository<InvardShipment, Integer> {

}