package com.test.collections.hashmaps;

import java.sql.Types;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.collect.Maps;

public class CompareTwoHashMap
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Map<String, Integer> FUND_COLUMNS = new HashMap<String, Integer>();
		Map<String, Integer> FUND_COLUMNS1 = new HashMap<String, Integer>();
		FUND_COLUMNS1.put("FundId", Types.NVARCHAR);
		FUND_COLUMNS1.put("ShareclassId", Types.NVARCHAR);
		// FUND_COLUMNS.put("FundName", Types.NVARCHAR);
		// FUND_COLUMNS.put("PrimaryShareclass", Types.NVARCHAR);
		FUND_COLUMNS1.put("PortfolioId", Types.NVARCHAR);
		FUND_COLUMNS1.put("Status", Types.INTEGER);
		FUND_COLUMNS1.put("ShortName", Types.NVARCHAR);
		FUND_COLUMNS1.put("LegalStructure", Types.NVARCHAR);
		FUND_COLUMNS1.put("LegalName", Types.NVARCHAR);
		FUND_COLUMNS1.put("StartDate", Types.TIMESTAMP);
		FUND_COLUMNS1.put("ActivationDate", Types.TIMESTAMP);
		FUND_COLUMNS1.put("Domicile", Types.NVARCHAR);
		FUND_COLUMNS1.put("Currency", Types.NVARCHAR);
		FUND_COLUMNS1.put("CUSIP", Types.NVARCHAR);
		FUND_COLUMNS1.put("ISIN", Types.NVARCHAR);
		FUND_COLUMNS1.put("CategoryId", Types.NVARCHAR);
		FUND_COLUMNS1.put("CategoryBenchmarkId", Types.NVARCHAR);
		FUND_COLUMNS1.put("BenchmarkId", Types.NVARCHAR);
		FUND_COLUMNS1.put("PerformanceId", Types.NVARCHAR);
		FUND_COLUMNS1.put("MarketCapitol", Types.NVARCHAR);
		FUND_COLUMNS1.put("TotalExpenseRatio", Types.NVARCHAR);
		FUND_COLUMNS1.put("AUMDate", Types.TIMESTAMP);
		FUND_COLUMNS1.put("AUM", Types.DECIMAL);
		FUND_COLUMNS1.put("Yield", Types.DECIMAL);
		FUND_COLUMNS1.put("YieldDate", Types.TIMESTAMP);
		FUND_COLUMNS1.put("AssetClass", Types.NVARCHAR);
		FUND_COLUMNS1.put("IncomeInvestmentStyle", Types.NVARCHAR);
		FUND_COLUMNS1.put("AccumulationInvestmentStyle", Types.NVARCHAR);
		FUND_COLUMNS1.put("EquityInvestmentStyle", Types.NVARCHAR);
		FUND_COLUMNS1.put("BondInvestmentStyle", Types.NVARCHAR);
		FUND_COLUMNS1.put("TradingLaunchDate", Types.TIMESTAMP);
		FUND_COLUMNS1.put("CurrencyCode", Types.NVARCHAR);
		FUND_COLUMNS1.put("KIIDObjective", Types.NVARCHAR);
		FUND_COLUMNS1.put("KIIDOngoingChargeHistory", Types.NVARCHAR);
		FUND_COLUMNS1.put("LegalStructureId", Types.NVARCHAR);
		FUND_COLUMNS1.put("OECategoryRank", Types.NVARCHAR);
		FUND_COLUMNS1.put("CECategoryRank", Types.NVARCHAR);
		FUND_COLUMNS1.put("IMARank", Types.NVARCHAR);
		FUND_COLUMNS1.put("IMASector", Types.NVARCHAR);
		FUND_COLUMNS1.put("GrossExpenseRatio", Types.DECIMAL);
		FUND_COLUMNS1.put("ShareClassAUM", Types.NVARCHAR);
		FUND_COLUMNS1.put("ShareClassAUMDate", Types.TIMESTAMP);
		FUND_COLUMNS1.put("SRRITrackRiskRating", Types.NVARCHAR);
		FUND_COLUMNS1.put("FundCompanyId", Types.NVARCHAR);
		FUND_COLUMNS1.put("FundPrimaryShareclass", Types.NVARCHAR);
		FUND_COLUMNS1.put("FundLegalName", Types.NVARCHAR);
		FUND_COLUMNS1.put("FundStartDate", Types.TIMESTAMP);
		FUND_COLUMNS1.put("RowHashValue", Types.NVARCHAR);
		FUND_COLUMNS1.put("IsFund", 0);

		FUND_COLUMNS.put("FundId", Types.NVARCHAR);
		// FUND_COLUMNS.put("FundName", Types.NVARCHAR);
		// FUND_COLUMNS.put("PrimaryShareclass", Types.NVARCHAR);
		FUND_COLUMNS.put("PortfolioId", Types.NVARCHAR);
		FUND_COLUMNS.put("Status", Types.INTEGER);
		FUND_COLUMNS.put("ShortName", Types.NVARCHAR);
		FUND_COLUMNS.put("LegalStructure", Types.NVARCHAR);
		FUND_COLUMNS.put("LegalName", Types.NVARCHAR);
		FUND_COLUMNS.put("StartDate", Types.TIMESTAMP);
		FUND_COLUMNS.put("ActivationDate", Types.TIMESTAMP);
		FUND_COLUMNS.put("Domicile", Types.NVARCHAR);
		FUND_COLUMNS.put("Currency", Types.NVARCHAR);
		FUND_COLUMNS.put("CUSIP", Types.NVARCHAR);
		FUND_COLUMNS.put("ISIN", Types.NVARCHAR);
		FUND_COLUMNS.put("CategoryId", Types.NVARCHAR);
		FUND_COLUMNS.put("CategoryBenchmarkId", Types.NVARCHAR);
		FUND_COLUMNS.put("BenchmarkId", Types.NVARCHAR);
		FUND_COLUMNS.put("PerformanceId", Types.NVARCHAR);
		FUND_COLUMNS.put("MarketCapitol", Types.NVARCHAR);
		FUND_COLUMNS.put("TotalExpenseRatio", Types.NVARCHAR);
		FUND_COLUMNS.put("AUMDate", Types.TIMESTAMP);
		FUND_COLUMNS.put("AUM", Types.DECIMAL);
		FUND_COLUMNS.put("Yield", Types.DECIMAL);
		FUND_COLUMNS.put("YieldDate", Types.TIMESTAMP);
		FUND_COLUMNS.put("AssetClass", Types.NVARCHAR);
		FUND_COLUMNS.put("IncomeInvestmentStyle", Types.NVARCHAR);
		FUND_COLUMNS.put("AccumulationInvestmentStyle", Types.NVARCHAR);
		FUND_COLUMNS.put("EquityInvestmentStyle", Types.NVARCHAR);
		FUND_COLUMNS.put("BondInvestmentStyle", Types.NVARCHAR);
		FUND_COLUMNS.put("TradingLaunchDate", Types.TIMESTAMP);
		FUND_COLUMNS.put("CurrencyCode", Types.NVARCHAR);
		FUND_COLUMNS.put("KIIDObjective", Types.NVARCHAR);
		FUND_COLUMNS.put("KIIDOngoingChargeHistory", Types.NVARCHAR);
		FUND_COLUMNS.put("LegalStructureId", Types.NVARCHAR);
		FUND_COLUMNS.put("OECategoryRank", Types.NVARCHAR);
		FUND_COLUMNS.put("CECategoryRank", Types.NVARCHAR);
		FUND_COLUMNS.put("IMARank", Types.NVARCHAR);
		FUND_COLUMNS.put("IMASector", Types.NVARCHAR);
		FUND_COLUMNS.put("GrossExpenseRatio", Types.DECIMAL);
		FUND_COLUMNS.put("ShareClassAUM", Types.NVARCHAR);
		FUND_COLUMNS.put("ShareClassAUMDate", Types.TIMESTAMP);
		FUND_COLUMNS.put("SRRITrackRiskRating", Types.NVARCHAR);
		FUND_COLUMNS.put("FundCompanyId", Types.NVARCHAR);
		FUND_COLUMNS.put("FundPrimaryShareclass", Types.NVARCHAR);
		FUND_COLUMNS.put("FundLegalName", Types.NVARCHAR);
		FUND_COLUMNS.put("FundStartDate", Types.TIMESTAMP);
		FUND_COLUMNS.put("Rowhash", Types.CHAR);
		FUND_COLUMNS.put("UpdateToLoaders", Types.BIT);
		FUND_COLUMNS.put("ShareclassId", Types.NVARCHAR);
		FUND_COLUMNS.put("IsFund", Types.BIT);
		
/*		  Set<String> removedKeys = new HashSet<String>(FUND_COLUMNS1.keySet());
		  removedKeys.removeAll(FUND_COLUMNS.keySet());
		  
		  Set<String> addedKeys = new HashSet<String>(FUND_COLUMNS.keySet());
		  addedKeys.removeAll(FUND_COLUMNS1.keySet());
		  
		  Set<Entry<String, String>> changedEntries = new HashSet<Entry<String,
		  String>>(); changedEntries.removeAll(FUND_COLUMNS1.entrySet());
		  
		  System.out.println(changedEntries);
		  
		  System.out.println("added " + addedKeys);
		  System.out.println("removed " + removedKeys);
		  System.out.println("changed " + changedEntries);*/
		
		System.out.println(Maps.difference(FUND_COLUMNS, FUND_COLUMNS1));
		 

	}

}
