package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ENTITY")
public class Contents {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "contentId")
	private long contentId;	
	
	private String messageSubject;
//	private PaymentControlDataNo paymentControlDataNo;
	@OneToOne(targetEntity = VolPayHubAlertNotification1.class ,cascade = CascadeType.ALL)
	private VolPayHubAlertNotification1 volPayHubAlertNotification1 ;
	
	public String getMessageSubject() {
		return messageSubject;
	}

	public void setMessageSubject(String messageSubject) {
		this.messageSubject = messageSubject;
	}

	public long getContentId() {
		return contentId;
	}

	public void setContentId(long contentId) {
		this.contentId = contentId;
	}

	public VolPayHubAlertNotification1 getVolPayHubAlertNotification1() {
		return volPayHubAlertNotification1;
	}

	public void setVolPayHubAlertNotification1(VolPayHubAlertNotification1 volPayHubAlertNotification1) {
		this.volPayHubAlertNotification1 = volPayHubAlertNotification1;
	}

	/*
	 * public PaymentControlDataNo getPaymentControlDataNo() { return
	 * paymentControlDataNo; }
	 * 
	 * public void setPaymentControlDataNo(PaymentControlDataNo
	 * paymentControlDataNo) { this.paymentControlDataNo = paymentControlDataNo; }
	 */
}
