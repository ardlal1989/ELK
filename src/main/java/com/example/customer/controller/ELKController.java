package com.example.customer.controller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.customer.ReportModel;
import com.example.customer.Row;
import com.example.customer.Sample;
import com.example.customer.entity.Report;
import com.example.customer.service.ReportService;


@Controller
public class ELKController {
	
	@Autowired  
	ReportService reportService; 
	
	@GetMapping("/elkLoad")
	@ResponseBody
    public String elkLoad() {
		
		  ReportModel rep= reportService.convertXMLToObject();  
          Report report=new Report();
          SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yy HH:mm");
	         
	        List<Row> rowList=rep.getRows(); 
	        for(int i=0;i<rowList.size();i++)
	        {
	        String date=rowList.get(i).getDate();

	        List<Sample> sample=rowList.get(i).getSample();
	        for(int j=0;j<sample.size();j++)
	        {
	        	try {
					report.setDate(dateParser.parse(date));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	report.setMetricData(sample.get(j).getData());
	        	report.setMetricName(sample.get(j).getLabel());
	        	report.setMetricValue(Double.parseDouble(sample.get(j).getValue()));
	        	reportService.add(report);
	        	report=new Report();
	        }
	        }
	        
        return "DB Load is complete...";
    }
	
	


}
