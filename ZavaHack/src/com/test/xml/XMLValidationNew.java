package com.test.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLValidationNew
{
	static int counter = 0;

	public static void main(String[] args)
	{
		
		File dir = new File("C:/test/xml");
		File[] directoryListing = dir.listFiles();
		
		if (directoryListing != null)
		{
			for (File child : directoryListing)
			{
				++counter;
				System.out.println("validate file : "+child.getName()+"---");
				validateOneXMLMultipleSchema(child);
				//System.out.println("validate file : "+child.getName());
			}
		}
		
		System.out.println("CounterValue : " + counter);
	}



	public static boolean validateOneXMLMultipleSchema(File xmlFile)
	{
		String xsdPath = "C:/test/xsd";
		File dir = new File(xsdPath);
		File[] directoryListing = dir.listFiles();
		boolean isValid = false;
		if (directoryListing != null)
		{
			for (File child : directoryListing)
			{
				++counter;
				System.out.println("validate file : "+child.getName()+"---");
				isValid = validateXMLSchema(child.getAbsolutePath(), xmlFile);
				//System.out.println("validate file : "+child.getName());
			}
		}
		
		return isValid;
	}
	public static boolean validateXMLSchema(String xsdPath, File xmlFile)
	{


		try
		{
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(xmlFile));
		}
		catch (IOException | SAXException e)
		{
			System.out.println("Exception: " + e.getMessage());
			return false;
		}
		return true;
	
	}

}