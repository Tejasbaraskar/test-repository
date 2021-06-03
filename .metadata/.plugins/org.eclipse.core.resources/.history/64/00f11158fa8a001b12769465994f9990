package com.org.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users implements Serializable{
	private String userType;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userFullName;
	private BigInteger userPhone;
	private String userEmail;
	private String userCity;
	private String userState;
	private String gender;
	private String userName;
	private String userPassword;
	
	

	/**
	 * Parameterized Constructors of Users
	 */
	public Users(String userType, int userId, String userFullName, BigInteger userPhone, String userEmail,
			String userCity, String userState, String gender, String userName, String userPassword) {
		super();
		this.userType = userType;
		this.userId = userId;
		this.userFullName = userFullName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userCity = userCity;
		this.userState = userState;
		this.gender = gender;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	

	public String getUserFullName() {
		return userFullName;
	}


	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	/**
	 * Unparameterized Constructor of User
	 */
	public Users() {
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public BigInteger getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(BigInteger userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}