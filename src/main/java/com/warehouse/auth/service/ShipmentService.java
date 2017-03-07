package com.warehouse.auth.service;

import org.springframework.stereotype.Component;

import com.warehouse.auth.model.InvardShipment;
import com.warehouse.auth.model.User;

@Component
public interface ShipmentService {
    void save(InvardShipment shipmentForm);

    User findByUsername(String username);
}
