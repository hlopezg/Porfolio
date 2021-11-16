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
        
        public Map <String, Stock> getStocks(){
            return stockList;
        }
	
            /**
    * calculate the profit (overall return) for a specific period for all stocks on the portfolio. The formula is (ending value - beginning value) / beginning value
    * @param period1 
    * @param period2
    * @return overall return
    */
	public Double profit(Integer period1, Integer period2){
		Double sum = 0d;
		for (Map.Entry<String, Stock> entry : stockList.entrySet()) {
		    String key = entry.getKey();
		    Stock stock = entry.getValue();
                    try{
                        sum = sum + stock.stockProfit(period1, period2);
                    }catch(Exception ex){
                       //there is no stocks for this period 
                    }
                    
		}
		return sum;
	}
        
    /**
    * calculate the Annualized return for a specific period for all stocks on the portfolio. The formula is Math.pow((1 + overallReturn), (1 / N)) -1;
    * @param period1 
    * @param period2
    * @return annalized return
    */
    public Double portfolioAnnualizedReturn (Integer period1, Integer period2) {
            Double sum = 0d;
            for (Map.Entry<String, Stock> entry : stockList.entrySet()) {
                String key = entry.getKey();
                Stock stock = entry.getValue();
                try{
                    sum = sum + stock.annualizedReturn(period1, period2);
                }catch(Exception ex){
                    //there is no stocks for this period
                }

            }
            return sum;
    }
}
