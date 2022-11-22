package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VolPayHubAlertNotification1")
public class VolPayHubAlertNotification1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String uniqueReferenceId;
	private String eventID;
	private String sourceSystemId;
	@OneToOne(targetEntity = Contents.class , mappedBy = "volPayHubAlertNotification1",cascade = CascadeType.ALL)	
	private Contents contents;

	public Contents getContents() {
		return contents;
	}

	public void setContents(Contents contents) {
		this.contents = contents;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUniqueReferenceId() {
		return uniqueReferenceId;
	}

	public void setUniqueReferenceId(String uniqueReferenceId) {
		this.uniqueReferenceId = uniqueReferenceId;
	}

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public String getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}
}
