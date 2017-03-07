package com.warehouse.auth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "shipmentMaster")
public class ShipmentMaster {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;
    
    private Integer materialNO;
    
    private String materialLongText;
    
    private String type;
    
    private String cat;
    
    private Integer packing;
    
    private Integer gw;
    
    private Integer nw;
    
    private Integer length;
    
    private Integer width;
    
    private Integer height;
    
    private String category;
    
    private String subCategory;
    
    private String ready;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getMaterialNO() {
		return materialNO;
	}

	public void setMaterialNO(Integer materialNO) {
		this.materialNO = materialNO;
	}

	public String getMaterialLongText() {
		return materialLongText;
	}

	public void setMaterialLongText(String materialLongText) {
		this.materialLongText = materialLongText;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public Integer getPacking() {
		return packing;
	}

	public void setPacking(Integer packing) {
		this.packing = packing;
	}

	public Integer getGw() {
		return gw;
	}

	public void setGw(Integer gw) {
		this.gw = gw;
	}

	public Integer getNw() {
		return nw;
	}

	public void setNw(Integer nw) {
		this.nw = nw;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getReady() {
		return ready;
	}

	public void setReady(String ready) {
		this.ready = ready;
	}
	
}
