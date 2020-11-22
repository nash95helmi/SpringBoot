package com.example.deviceInt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products implements Serializable{

	private static final long serialVersionUID = 8469046435804469947L;
	
	@Id
	@Column(name = "product_code")
	private String id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_name_new")
	private String productNameNew;
	
	@Column(name = "category_code")
	private String categoryCode;
	
	@Column(name = "menu_group_code")
	private String menu_group_code;
	
	@Column(name = "unit_code")
	private String unitCode;
	
	@Column(name = "type_code")
	private String typeCode;
	
	@Column(name = "form_code")
	private String formCode;
	
	@Column(name = "product_sale_price")
	private Long productSalePrice;
	
	@Column(name = "product_discontinued")
	private Boolean productDiscontinued;
	
	@Column(name = "product_guarantee_days")
	private Integer productGuaranteeDays;
	
	@Column(name = "product_bom")
	private Boolean productBom; 
	
	@Column(name = "diet_code")
	private String dietCode;
	
	@Column(name = "product_reorder")
	private Integer productReorder;
	
	@Column(name = "product_group_code")
	private String productGroupCode;
	
	@Column(name = "product_subgroup_code")
	private String productSubgroupCode;
	
	@Column(name = "order_active")
	private Boolean orderActive;
	
	@Column(name = "product_class_code")
	private String productClassCode;
	
	@Column(name = "product_ris")
	private Boolean productRis;
	
	@Column(name = "daycare")
	private Boolean daycare;
	
	@Column(name = "icd9_cm_id")
	private Integer icd9CmId;
	
	@Column(name = "icd9_cm")
	private String icd9Cm; 

	@Column(name = "integration_active")
	private Boolean integrationActive;
	
	@Column(name = "product_active")
	private Boolean productActive;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private String createdDate;
	
	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_date")
	private String updatedDate;
	
	public Products(String id, String productName, String productNameNew, String categoryCode, String menu_group_code,
			String unitCode, String typeCode, String formCode, Long productSalePrice, Boolean productDiscontinued,
			Integer productGuaranteeDays, Boolean productBom, String dietCode, Integer productReorder,
			String productGroupCode, String productSubgroupCode, Boolean orderActive, String productClassCode,
			Boolean productRis, Boolean daycare, Integer icd9CmId, String icd9Cm, Boolean integrationActive,
			Boolean productActive, String createdBy, String createdDate, String updatedBy, String updatedDate) {
		super();
		this.id = id;
		this.productName = productName;
		this.productNameNew = productNameNew;
		this.categoryCode = categoryCode;
		this.menu_group_code = menu_group_code;
		this.unitCode = unitCode;
		this.typeCode = typeCode;
		this.formCode = formCode;
		this.productSalePrice = productSalePrice;
		this.productDiscontinued = productDiscontinued;
		this.productGuaranteeDays = productGuaranteeDays;
		this.productBom = productBom;
		this.dietCode = dietCode;
		this.productReorder = productReorder;
		this.productGroupCode = productGroupCode;
		this.productSubgroupCode = productSubgroupCode;
		this.orderActive = orderActive;
		this.productClassCode = productClassCode;
		this.productRis = productRis;
		this.daycare = daycare;
		this.icd9CmId = icd9CmId;
		this.icd9Cm = icd9Cm;
		this.integrationActive = integrationActive;
		this.productActive = productActive;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNameNew() {
		return productNameNew;
	}

	public void setProductNameNew(String productNameNew) {
		this.productNameNew = productNameNew;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getMenu_group_code() {
		return menu_group_code;
	}

	public void setMenu_group_code(String menu_group_code) {
		this.menu_group_code = menu_group_code;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getFormCode() {
		return formCode;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public Long getProductSalePrice() {
		return productSalePrice;
	}

	public void setProductSalePrice(Long productSalePrice) {
		this.productSalePrice = productSalePrice;
	}

	public Boolean getProductDiscontinued() {
		return productDiscontinued;
	}

	public void setProductDiscontinued(Boolean productDiscontinued) {
		this.productDiscontinued = productDiscontinued;
	}

	public Integer getProductGuaranteeDays() {
		return productGuaranteeDays;
	}

	public void setProductGuaranteeDays(Integer productGuaranteeDays) {
		this.productGuaranteeDays = productGuaranteeDays;
	}

	public Boolean getProductBom() {
		return productBom;
	}

	public void setProductBom(Boolean productBom) {
		this.productBom = productBom;
	}

	public String getDietCode() {
		return dietCode;
	}

	public void setDietCode(String dietCode) {
		this.dietCode = dietCode;
	}

	public Integer getProductReorder() {
		return productReorder;
	}

	public void setProductReorder(Integer productReorder) {
		this.productReorder = productReorder;
	}

	public String getProductGroupCode() {
		return productGroupCode;
	}

	public void setProductGroupCode(String productGroupCode) {
		this.productGroupCode = productGroupCode;
	}

	public String getProductSubgroupCode() {
		return productSubgroupCode;
	}

	public void setProductSubgroupCode(String productSubgroupCode) {
		this.productSubgroupCode = productSubgroupCode;
	}

	public Boolean getOrderActive() {
		return orderActive;
	}

	public void setOrderActive(Boolean orderActive) {
		this.orderActive = orderActive;
	}

	public String getProductClassCode() {
		return productClassCode;
	}

	public void setProductClassCode(String productClassCode) {
		this.productClassCode = productClassCode;
	}

	public Boolean getProductRis() {
		return productRis;
	}

	public void setProductRis(Boolean productRis) {
		this.productRis = productRis;
	}

	public Boolean getDaycare() {
		return daycare;
	}

	public void setDaycare(Boolean daycare) {
		this.daycare = daycare;
	}

	public Integer getIcd9CmId() {
		return icd9CmId;
	}

	public void setIcd9CmId(Integer icd9CmId) {
		this.icd9CmId = icd9CmId;
	}

	public String getIcd9Cm() {
		return icd9Cm;
	}

	public void setIcd9Cm(String icd9Cm) {
		this.icd9Cm = icd9Cm;
	}

	public Boolean getIntegrationActive() {
		return integrationActive;
	}

	public void setIntegrationActive(Boolean integrationActive) {
		this.integrationActive = integrationActive;
	}

	public Boolean getProductActive() {
		return productActive;
	}

	public void setProductActive(Boolean productActive) {
		this.productActive = productActive;
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
