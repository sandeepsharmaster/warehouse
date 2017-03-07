package com.warehouse.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.auth.model.InvardShipment;
import com.warehouse.auth.model.User;
import com.warehouse.auth.repository.ShipmentRepository;

@Service
public class ShipmentServiceImpl implements ShipmentService {
	
	@Autowired
    private ShipmentRepository shipmentRepository;

    @Override
    public void save(InvardShipment shipmentForm) {     
    	
    	shipmentRepository.save(shipmentForm);
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }
}
