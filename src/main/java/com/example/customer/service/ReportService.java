package com.example.customer.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.ReportModel;
import com.example.customer.dao.ReportRepository;
import com.example.customer.entity.Report;

@Service
public class ReportService {
	
	@Autowired  
	ReportRepository reportRepository;
	
	//add customer  
		public void add(Report report)   
		{  
			reportRepository.save(report);  
		}  
		
		public ReportModel convertXMLToObject()
		{
			ReportModel rep=null;
			try {  
				   
		        File file = new File("report.xml");  
		        JAXBContext jaxbContext = JAXBContext.newInstance(ReportModel.class);  
		   
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
		        rep= (ReportModel) jaxbUnmarshaller.unmarshal(file);  
		          
		       return rep;  
		   
		      } catch (JAXBException e) {  
		        e.printStackTrace();  
		      } 
			return rep; 
		}

}
