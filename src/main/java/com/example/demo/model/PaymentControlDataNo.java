package com.example.demo.model;

public class PaymentControlDataNo {
	private String branchCode;
	private String officeCode;
	private InstructionData instructionData;

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public InstructionData getInstructionData() {
		return instructionData;
	}

	public void setInstructionData(InstructionData instructionData) {
		this.instructionData = instructionData;
	}
}
