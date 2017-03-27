package com.upbuilding.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User
 * v1.0
 * @author Hedgehog
 */
public class User {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sname")
	private String sname;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "status")
	private Boolean status;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "bank_account_number")
	private Integer bankcardNumber;
	
	@Column(name = "number_of_views")
	private Integer countViews;
	
	@Column(name = "is_online")
	private Boolean isOnline;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "is_juristical_person")
	private Boolean isEntity;

	@Column(name = "city")
	private String city;	
	
	@Column(name = "country")
	private String country;	
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "startTime", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;
	
	@Column(name = "startTime", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date registrationDate;
	
	@Column(name = "startTime", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoginDate;

	@Column(name = "is_man_gender")
	private Boolean isMan;

	public User(){}
	
	public User(
				String login,
				String email,
				String password
			)
	{
		this.login = login;
		this.email = email;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getBankcardNumber() {
		return bankcardNumber;
	}

	public void setBankcardNumber(Integer bankcardNumber) {
		this.bankcardNumber = bankcardNumber;
	}

	public Integer getCountViews() {
		return countViews;
	}

	public void setCountViews(Integer countViews) {
		this.countViews = countViews;
	}

	public Boolean getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsEntity() {
		return isEntity;
	}

	public void setIsEntity(Boolean isEntity) {
		this.isEntity = isEntity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	public Boolean getIsMan() {
		return isMan;
	}

	public void setIsMan(Boolean isMan) {
		this.isMan = isMan;
	}
}