package org.test.bean;

public class User {
	private String firstName;
	private String lastName;
	
	//for beans constructor need to be public, in fact constructor always need to be public.
	public User(){
		this.firstName = "First Name";
		this.lastName = "Last Name";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
