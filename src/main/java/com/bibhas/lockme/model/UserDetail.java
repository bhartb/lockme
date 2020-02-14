package com.bibhas.lockme.model;

import java.io.Serializable;

public class UserDetail  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Declare variable to store identity
	private String userName;
	
	private String userPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserDetail(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "UserDetail [userName=" + userName + ", userPassword=" + userPassword + "]";
	}


	

	}

	


