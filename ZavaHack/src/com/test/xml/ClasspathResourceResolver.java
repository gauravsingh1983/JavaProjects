package com.test.xml;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

public class ClasspathResourceResolver implements LSResourceResolver {
 
    @Override
    public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
 
        LSInput input = new LSInputImpl();
 
        File f = new File("MorningstarData/"+systemId);
        
        System.out.println(f.getAbsolutePath());
        //InputStream stream = this.getClass().getClassLoader().getResourceAsStream(systemId);
        InputStream stream = null;
		try
		{
			stream = new FileInputStream(f);
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        input.setPublicId(publicId);
        input.setSystemId(systemId);
        input.setBaseURI(baseURI);
        input.setCharacterStream(new InputStreamReader(stream));
 
        return input;
    }
}