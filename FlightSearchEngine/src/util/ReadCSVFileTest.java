package util;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ReadCSVFileTest extends TestCase {

	@Test
	public void testReadCSVFile()
	{
		ReadCSVFile rcv = new ReadCSVFile();
		Assert.assertNotNull(rcv.readFile());
	}
}
