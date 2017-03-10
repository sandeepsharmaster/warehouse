package com.warehouse.auth.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*@Entity
@Table(name = "shipmentScannerCodes")*/
public class ShipmentScannerCodes {
	
	 private Long id;
	
	String shipmentID;
	
	List<String> scanCodes = new ArrayList<String>();
	
	 /* @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    public Long getId() {
	        return id;
	    }
*/
	    public void setId(Long id) {
	        this.id = id;
	    }

	public String getShipmentID() {
		return shipmentID;
	}

	public void setShipmentID(String shipmentID) {
		this.shipmentID = shipmentID;
	}

	public List<String> getScanCodes() {
		return scanCodes;
	}

	public void setScanCodes(List<String> scanCodes) {
		this.scanCodes = scanCodes;
	}

}
