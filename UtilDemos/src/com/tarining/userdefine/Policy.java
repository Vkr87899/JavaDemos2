package com.tarining.userdefine;

public class Policy {
	private String policyName;
	private String type;
	private String company;
	public Policy(String policyName, String type, String company) {
		super();
		this.policyName = policyName;
		this.type = type;
		this.company = company;
	}
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "policyName=" + policyName + ", type=" + type + ", company=" + company + "]";
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
