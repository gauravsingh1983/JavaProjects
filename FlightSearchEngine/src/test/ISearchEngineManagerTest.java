package test;

import java.util.Date;

import com.ISearchEngineManager;
import com.SearchEngineManagerImpl;

import junit.framework.TestCase;

public class ISearchEngineManagerTest extends TestCase {
	
	public void testSearchFlight()
	{
		Date flight_date=null;
		String dep_loc="";
		String arr_loc="";
		
		ISearchEngineManager searchMgr = new SearchEngineManagerImpl();
		
		assertNotNull(searchMgr.searchFlight(dep_loc, arr_loc, flight_date));
	}

}
