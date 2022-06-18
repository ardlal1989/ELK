package com.example.customer;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "row")
@XmlType(propOrder = {
    "date",
    "sample"
})
public class Row {

	private String date;
	private List<Sample> sample;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Sample> getSample() {
		return sample;
	}
	public void setSample(List<Sample> sample) {
		this.sample = sample;
	}
	
	
}
