package com.adminservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Admin {
@Id
@Column(name="adminid")
private Integer adminId;
@Column(name="adminemail")
private String adminEmail;
@Column(name="adpassword")
private String password;
public Admin(Integer adminId, String adminEmail, String password) {
	super();
	this.adminId = adminId;
	this.adminEmail = adminEmail;
	this.password = password;
}
public Admin() {
	super();
}
public Integer getAdminId() {
	return adminId;
}
public void setAdminId(Integer adminId) {
	this.adminId = adminId;
}
public String getAdminEmail() {
	return adminEmail;
}
public void setAdminEmail(String adminEmail) {
	this.adminEmail = adminEmail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Admin [adminId=" + adminId + ", adminEmail=" + adminEmail + ", password=" + password + "]";
}

}
