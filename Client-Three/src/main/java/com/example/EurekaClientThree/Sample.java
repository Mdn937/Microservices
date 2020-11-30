package com.example.EurekaClientThree;

public class Sample {

	private String phone;

	private String addr;

	public Sample() {

	}

	public Sample(String phone, String ad) {

		this.phone = phone;
		addr = ad;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
