package com.bibhas.lockme.model;

public class UserCredential {
	
	String siteName;
	String userName;
	String userPassword;
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
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
	public UserCredential(String siteName, String userName, String userPassword) {
		super();
		this.siteName = siteName;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserCredential [siteName=" + siteName + ", userName=" + userName + ", userPassword=" + userPassword
				+ "]";
	}
	
	
}
