package com.example.deviceInt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "result_investigations_device")
public class ResultInvestigationsDevice implements Serializable{

	private static final long serialVersionUID = 6858982632005814579L;
	
	@Id
	@Column(name = "result_id")
	private Integer id;
	
	@Column(name = "order_id")
	private Integer orderId;
	
	@Column(name = "result_hyperlink")
	private String resultHyperlink;
	
	@Column(name = "result_json")
	private String resultJson;
	
	@Column(name = "doc_detail_id")
	private Integer docDetailId; 
	
	@Column(name = "doc_hyperlink_id")
	private Integer docHyperlinkId;
	
	@Column(name = "select_active")
	private Boolean selectActive;
	
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getResultHyperlink() {
		return resultHyperlink;
	}

	public void setResultHyperlink(String resultHyperlink) {
		this.resultHyperlink = resultHyperlink;
	}

	public String getResultJson() {
		return resultJson;
	}

	public void setResultJson(String resultJson) {
		this.resultJson = resultJson;
	}

	public Integer getDocDetailId() {
		return docDetailId;
	}

	public void setDocDetailId(Integer docDetailId) {
		this.docDetailId = docDetailId;
	}

	public Integer getDocHyperlinkId() {
		return docHyperlinkId;
	}

	public void setDocHyperlinkId(Integer docHyperlinkId) {
		this.docHyperlinkId = docHyperlinkId;
	}

	public Boolean getSelectActive() {
		return selectActive;
	}

	public void setSelectActive(Boolean selectActive) {
		this.selectActive = selectActive;
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
