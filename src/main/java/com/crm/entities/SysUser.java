package com.crm.entities;

public class SysUser {
	private Integer userId;//用户id
	private String userCode;//用户账号
	private String userName;//用户名称
	private String userPassword;//用户密码
	private Character userState;//用户状态：1：正常，0：暂停

	
	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getUserCode() {
		return userCode;
	}


	public void setUserCode(String userCode) {
		this.userCode = userCode;
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


	public Character getUserState() {
		return userState;
	}


	public void setUserState(Character userState) {
		this.userState = userState;
	}


	@Override
	public String toString() {
		return "SysUser [userId=" + userId + ", userCode=" + userCode + ", userName=" + userName + ", userPassword="
				+ userPassword + ", userState=" + userState + "]";
	}
	
	
}
