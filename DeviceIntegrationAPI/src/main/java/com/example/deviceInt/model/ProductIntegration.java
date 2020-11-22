package com.example.deviceInt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_integration")
public class ProductIntegration implements Serializable{

	private static final long serialVersionUID = -8841881862804410402L;
	
	@Id
	@Column(name = "integration_devices_code")
	private String integrationDeviceCode;
	
	@Column(name = "product_code")	//Shouldn't address as key, no error
	private String productCode;
	
	@Column(name = "active_status")
	private Boolean activeStatus;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private String createdDate;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	@Column(name = "updated_date")
	private String updatedDate;

	public String getIntegrationDeviceCode() {
		return integrationDeviceCode;
	}

	public void setIntegrationDeviceCode(String integrationDeviceCode) {
		this.integrationDeviceCode = integrationDeviceCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
}
