package springmvc.model;

import java.util.Date;

public class UserRegistration {

	private String email;
	private String password;
	private Date dob;
	private Contact contact;
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "UserRegistration [email=" + email + ", password=" + password + ", dob=" + dob + ", contact=" + contact
				+ "]";
	}
	
	
	
	
	
}
