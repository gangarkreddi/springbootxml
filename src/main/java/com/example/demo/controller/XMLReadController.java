package com.example.demo.controller;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.VolPayHubAlertNotification1;
import com.example.demo.service.XMLService;

@RestController
@RequestMapping("/xml")
public class XMLReadController {
	@Autowired
	XMLService service ;
	
	 VolPayHubAlertNotification1 volPayHubAlertNotification1 = null;
	
	@RequestMapping("/write")
	@GetMapping
	ResponseEntity<String> writeXML() throws FileNotFoundException, JAXBException{
		//volPayHubAlertNotification1 = readXml();
		service.write();
		return new ResponseEntity<String>("Success" , HttpStatus.OK);
		
	}

	private VolPayHubAlertNotification1 readXml() throws FileNotFoundException, JAXBException {
		File file = ResourceUtils.getFile("classpath:persons.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(VolPayHubAlertNotification1.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		VolPayHubAlertNotification1 customer = (VolPayHubAlertNotification1) jaxbUnmarshaller.unmarshal(file);
		return null;
	}

}
