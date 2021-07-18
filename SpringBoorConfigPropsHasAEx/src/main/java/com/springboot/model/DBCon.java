package com.springboot.model;

public class DBCon {
private String driver;
private String url;
private String userName;
private String password;
public String getDriver() {
	return driver;
}
public void setDriver(String driver) {
	this.driver = driver;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "DBCon [driver=" + driver + ", url=" + url + ", userName=" + userName + ", password=" + password + "]";
}


}
