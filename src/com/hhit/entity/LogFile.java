package com.hhit.entity;

import java.sql.Timestamp;
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : LogFile.java
//  @ Date : 2016/4/9
//  @ Author : 
//
//




public class LogFile implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userNum;
	private String ipAddress;
	private Timestamp operateTime;
	private String description;
	
	/**
	 * 默认构造函数
	 */
	public LogFile(){
		
	}
	public LogFile(String un,String ip,Timestamp t,String desc){
		userNum=un;
		ipAddress=ip;
		operateTime=t;
		description=desc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserNum() {
		return userNum;
	}
	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Timestamp getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(Timestamp operateTime) {
		this.operateTime = operateTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
