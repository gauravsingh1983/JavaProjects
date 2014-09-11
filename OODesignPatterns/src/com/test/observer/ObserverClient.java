package com.test.observer;

import java.util.ArrayList;

interface Order
{
	public abstract void execute();
}

// Receiver class.
class StockTrade
{
	public void buy()
	{
		System.out.println("You want to buy stocks");
	}

	public void sell()
	{
		System.out.println("You want to sell stocks");
	}
}

// Invoker.
class Agent
{
	private ArrayList	ordersQueue	= new ArrayList();

	public Agent()
	{
	}

	void placeOrder(Order order)
	{

		order.execute();
	}
}

// ConcreteCommand Class.
class BuyStockOrder implements Order
{
	private StockTrade	stock;

	public BuyStockOrder(StockTrade st)
	{
		stock = st;
	}

	public void execute()
	{
		stock.buy();
	}
}

// ConcreteCommand Class.
class SellStockOrder implements Order
{
	private StockTrade	stock;

	public SellStockOrder(StockTrade st)
	{
		stock = st;
	}

	public void execute()
	{
		stock.sell();
	}
}

// Client
public class ObserverClient
{
	public static void main(String[] args)
	{
		StockTrade stock = new StockTrade();
		BuyStockOrder bsc = new BuyStockOrder(stock);
		SellStockOrder ssc = new SellStockOrder(stock);
		Agent agent = new Agent();

		agent.placeOrder(new BuyStockOrder(stock){
			private StockTrade	stock;

			public void execute()
			{
				stock.buy();
			}
			
		}); 
		// Buy Shares
		agent.placeOrder(ssc); // Sell Shares
	}
}
