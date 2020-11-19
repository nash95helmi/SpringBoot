package com.documentsManager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "docmst")
public class DocMaster implements Serializable{

	private static final long serialVersionUID = -374287211600000382L;
	
	@Id
	@Column(name = "persid")
	private String id;
	
	@Column(name = "docid")
	private String documentID;

	
	public DocMaster() {}

	public DocMaster(String id, String documentID) {
		this.id = id;
		this.documentID = documentID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocumentID() {
		return documentID;
	}

	public void setDocumentID(String documentID) {
		this.documentID = documentID;
	}
}
