package com.example.customer;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "report")
public class ReportModel {

	@XmlElementWrapper(name = "rows")
    @XmlElement(name = "row")
    private List <Row> row;

	public List<Row> getRows() {
		return row;
	}

	public void setRows(List<Row> rows) {
		this.row = rows;
	}
   

    
}