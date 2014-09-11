package com.test.xml;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class MorningStar {
	public static void main(String[] args) throws SAXException, IOException {
		
		//URL xmlResource = MorningStar.class.getClassLoader().getResource("C:/test/xml/E0BEL0106K.xml");
		
		//URL schemaFile = new URL("http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd");
		//URL schemaFile = MorningStar.class.getClassLoader().getResource(new File("FundShareClass.xsd"));
		
		Source xmlFile = new StreamSource(new File("C:/test/xml/E0BEL0106K.xml"));
		
		SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		Schema schema = schemaFactory.newSchema(new File("FundShareClass.xsd"));
		javax.xml.validation.Validator validator = schema.newValidator();
		
		try {
		  validator.validate(xmlFile);
		  System.out.println(xmlFile.getSystemId() + " is valid - true");
		} 
		catch (SAXException e) {
		  System.out.println(xmlFile.getSystemId() + " is NOT valid");
		  System.out.println("Reason: " + e.getLocalizedMessage());
		}
	}
}
