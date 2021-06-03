package com.jachs.mongodb.entity;

/***
 * 
 * @author zhanchaohan
 *
 */
public class User {
	private int UserId;
	private String UserName;
	private String UserPwd;
	private int  Age;
	
	public User() {
		super();
	}

	public User(int userId, String userName, String userPwd, int age) {
		super();
		UserId = userId;
		UserName = userName;
		UserPwd = userPwd;
		Age = age;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserPwd() {
		return UserPwd;
	}

	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	
}
