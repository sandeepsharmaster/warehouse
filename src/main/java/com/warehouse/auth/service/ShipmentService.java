package com.warehouse.auth.service;

import org.springframework.stereotype.Component;

import com.warehouse.auth.model.User;
import com.warehouse.shipment.model.InvardShipment;

@Component
public interface ShipmentService {
    void save(InvardShipment shipmentForm);

    User findByUsername(String username);
}
