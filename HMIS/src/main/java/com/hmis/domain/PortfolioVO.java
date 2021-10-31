package com.hmis.domain;

public class PortfolioVO {

	private int userNo;
	private float avgScore;
	private String jobArea;
	private String phone;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public float getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(float avgScore) {
		this.avgScore = avgScore;
	}

	public String getJobArea() {
		return jobArea;
	}

	public void setJobArea(String jobArea) {
		this.jobArea = jobArea;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "PortfolioVO [userNo=" + userNo + ", avgScore=" + avgScore + ", jobArea=" + jobArea + ", phone=" + phone
				+ "]";
	}

}
