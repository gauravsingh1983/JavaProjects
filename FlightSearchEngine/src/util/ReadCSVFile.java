package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

import dao.Flight;
import dao.FlightS;

public class ReadCSVFile {
	
public static void main(String[] args)
{
	ReadCSVFile rcv = new ReadCSVFile();
	rcv.getFilePath();
	
}

public static String getFilePath()
{
	String filePath = null;
	try (FileReader reader = new FileReader("C:\\gaurav\\KRSWorkSpace\\FlightSearchEngine\\src\\util\\flightsearchengine.properties")) {
		Properties properties = new Properties();
		properties.load(reader);
		filePath = properties.getProperty("pathToCSV");
		System.out.println(filePath);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return filePath;
}

   public static List<Flight> readFile() {
	   List<FlightS> flightList = null;
	   List<Flight> fList = null;
    try { 
			
      //String csvFile = "C:\\test\\airfrance.csv";
      String csvFile = getFilePath();
      
      //create BufferedReader to read csv file
      BufferedReader br = new BufferedReader(new FileReader(csvFile));
      String line = "";
      StringTokenizer st = null;

      int lineNumber = 0; 
      
      fList = new ArrayList<Flight>();
      Flight f = null;
      //read comma separated file line by line
      while ((line = br.readLine()) != null) {
        ++lineNumber;

       f = new Flight();
        //use comma as token separator
       String[] values = line.split("\\|");
       
       f.setFLIGHT_NUM(values[0]);
       f.setDEP_LOC(values[1]);
       f.setARR_LOC(values[2]);
       f.setVALID_TILL(FlightUtil.flightValidTillToDate(values[3]));
       f.setFLIGHT_TIME(FlightUtil.flightTimeToDate(values[4]));
       f.setFLIGHT_DURN(FlightUtil.flightDurationToDate(values[5]));
       f.setFARE(Double.parseDouble(values[6]));

       fList.add(f);
        //reset token number
      }
      System.out.println(fList);

    } catch (Exception e) {
      System.err.println("CSV file cannot be read : " + e);
    }
	return fList;
  }

}

