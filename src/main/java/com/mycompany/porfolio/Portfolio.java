package com.mycompany.porfolio;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
	private Map <String, Stock> stockList = new HashMap<>();
	
	public Stock addStock(String name) {
		Stock stock = new Stock();
		stockList.put(name, stock);
		return stock;
		
	}
	
	public Stock getStock(String name) {
		return stockList.get(name);
	}
	
	public Double profit(Integer period1, Integer period2) {
		Double sum = 0d;
		for (Map.Entry<String, Stock> entry : stockList.entrySet()) {
		    String key = entry.getKey();
		    Stock stock = entry.getValue();
		    sum = sum + stock.stockProfit(period1, period2);
		}
		return sum;
	}
 
        public Double portfolioAnnualizedReturn (Integer period1, Integer period2) {
            	Double sum = 0d;
		for (Map.Entry<String, Stock> entry : stockList.entrySet()) {
		    String key = entry.getKey();
		    Stock stock = entry.getValue();
		    sum = sum + stock.annualizedReturn(period1, period2);
		}
		return sum;
        }
}
