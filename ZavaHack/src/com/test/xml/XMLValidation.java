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

public class XMLValidation
{

	public static void main(String[] args)
	{

		 System.out.println("FOUSA06CTV.xml validating ? "+validateXMLSchema("C:/test/xsd/FundShareClass.xsd", new File("c:/test/xml/F0GBR04LIB.xml")));
		// System.out.println("EmployeeResponse.xml validates against Employee.xsd? "+validateXMLSchema("Employee.xsd",
		// "EmployeeResponse.xml"));
		// System.out.println("employee.xml validates against Employee.xsd? "+validateXMLSchema("Employee.xsd",
		// "employee.xml"));
		/*String xsdPath = "C:/test/xsd";
		String xmlPath = "C:/test/xml";

		File dir = new File("C:/media/data/xmls");
		File[] directoryListing = dir.listFiles();
		Source[] xsdArr = new Source[directoryListing.length];

		if (directoryListing != null)
		{
			for (File child : directoryListing)
			{
				System.out.println("validate file : "+child.getName()+"---"+validateXMLSchema(xsdPath, child));
			}
		}*/
	}

	private static Source[] getXsd(String xsdPath)
	{
		
		File dir = new File(xsdPath);
		File[] directoryListing = dir.listFiles();
		Source[] xsdArr = new Source[directoryListing.length];

		if (directoryListing != null)
		{
			// for (File child : directoryListing) {
			for (int i = 0; i < directoryListing.length; i++)
			{

				xsdArr[i] = new StreamSource(directoryListing[i].getPath());
				// System.out.println(xsdArr[i]);
			}
		}

		return xsdArr;
	}

	public static boolean validateXMLSchema(String xsdPath, File xmlFile)
	{

		try
		{
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			factory.setResourceResolver(new ClasspathResourceResolver());
			Schema schema = factory.newSchema(new File("MorningstarData/FundShareClass.xsd"));
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
	/*
	 * public static boolean validateXMLSchema(String xsdPath, String xmlPath){
	 * 
	 * try { SchemaFactory factory =
	 * SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); Schema
	 * schema = factory.newSchema(new File(xsdPath)); Validator validator =
	 * schema.newValidator(); validator.validate(new StreamSource(new
	 * File(xmlPath))); } catch (IOException | SAXException e) {
	 * System.out.println("Exception: "+e.getMessage()); return false; } return
	 * true; }
	 */
}