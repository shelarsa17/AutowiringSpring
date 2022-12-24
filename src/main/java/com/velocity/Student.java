package com.velocity;

public class Student {

	private String firstName;
	private String lastName;
	private Address address;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void getStudentDetails() {
		System.out.println("Student FirstName>>" + firstName);
		System.out.println("Student LastName>>" + lastName);
		System.out.println("Student CityName>>" + address.getCityname());
		System.out.println("Student Pincode>>" + address.getPincode());
		System.out.println("Student StateName>>" + address.getState());
	}

}
