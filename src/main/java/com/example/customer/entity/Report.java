package com.example.customer.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Report {
	
	@Id  
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 
	
	@Column  
	private Date date;
	@Column  
	private String metricName;
	@Column  
	private String metricData;
	@Column  
	private double metricValue;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMetricName() {
		return metricName;
	}
	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}
	public String getMetricData() {
		return metricData;
	}
	public void setMetricData(String metricData) {
		this.metricData = metricData;
	}
	public double getMetricValue() {
		return metricValue;
	}
	public void setMetricValue(double metricValue) {
		this.metricValue = metricValue;
	}
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Report(long id, Date date, String metricName, String metricData, double metricValue) {
		super();
		this.id = id;
		this.date = date;
		this.metricName = metricName;
		this.metricData = metricData;
		this.metricValue = metricValue;
	}
	
	
    
	
	


}

