package com.cg.Springcore;

public class Customer {

	private int id;

	private String name;

	private String address;

	private int contact;

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String address) {

		this.address = address;

	}

	public int getContact() {

		return contact;

	}

	public void setContact(int contact) {

		this.contact = contact;

	}

	@Override

	public String toString() {

		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";

	}

}
