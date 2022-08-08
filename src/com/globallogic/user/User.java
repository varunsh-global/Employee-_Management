package com.globallogic.user;
public class User {
    protected int id;
    protected String firstname;
    protected String last_name;
    protected String username;
    protected String password;
    protected String address;
    protected String contact;

    public User() {}

	public User(String firstname, String last_name, String username, String password, String address,
			String contact) {
		super();
		this.firstname = firstname;
		this.last_name = last_name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}

	public User(int id, String firstname, String last_name, String username,String password,
			String address, String contact) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.last_name = last_name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
    
}
