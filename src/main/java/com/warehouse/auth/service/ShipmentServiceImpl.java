package com.warehouse.auth.service;

import org.springframework.stereotype.Service;

import com.warehouse.auth.model.User;
import com.warehouse.shipment.model.InvardShipment;

@Service
public class ShipmentServiceImpl implements ShipmentService {
   

    @Override
    public void save(InvardShipment shipmentForm) {
       /* user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);*/
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }
}
