/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.porfolio;

/**
 *
 * @author hecto
 */
public class FintualApp {
    public static void main (String args[]) {
            Portfolio portfolio = new Portfolio();
            Stock stock;

            stock = portfolio.addStock("Microsoft");
            stock.addPrice(1, 20d);
            stock.addPrice(2, 40d);

            stock = portfolio.addStock("Apple");
            stock.addPrice(1, 200d);
            stock.addPrice(2, 300d);
            
            stock = portfolio.addStock("Fintual");
            stock.addPrice(1, 2000d);
            stock.addPrice(5, 5000d);

            showPrice("Microsoft" , 1, portfolio.getStock("Microsoft").getPrice(1));
            showPrice("Microsoft" , 2, portfolio.getStock("Microsoft").getPrice(2));

            showPrice("Apple" , 1, portfolio.getStock("Apple").getPrice(1));
            showPrice("Apple" , 2, portfolio.getStock("Apple").getPrice(2));            
            
            showPrice("Fintual" , 1, portfolio.getStock("Fintual").getPrice(1));
            showPrice("Fintual" , 5, portfolio.getStock("Fintual").getPrice(5));
            
            showStockProfit(portfolio.getStock("Microsoft"),1 , 2);
            showStockProfit(portfolio.getStock("Apple"),1 , 2);
            showStockProfit(portfolio.getStock("Fintual"),1 , 5);

            showSumProfit(portfolio,1 ,2);
    }
    
    private static void showPrice(String name, int period, double price){
        System.out.println(String.format("%s price on period %x: %f", name, period, price));
    }
    
    private static void showStockProfit(Stock stock, int period1, int period2){
        System.out.println(String.format("Overall return of %s between period %x and period %x: %f", stock, period1, period2, stock.stockProfit(period1, period2)));
        System.out.println(String.format("Annualized return of %s between period %x and period %x: %f", stock, period1, period2, stock.annualizedReturn(period1, period2)));
    }
    
    /**
     * shows the Overall and Annualized return for a specific period (if it's possible) off all stocks
    * @param portfolio 
    * @param period 1
    * @param period 2
    */
    private static void showSumProfit(Portfolio portfolio, int period1, int period2){
        System.out.println(String.format("Overall return between period %x and period %x (all stocks): %f", period1, period2, portfolio.profit(period1, period2)));
        System.out.println(String.format("Annualized return between period %x and period %x (all stocks): %f", period1, period2, portfolio.portfolioAnnualizedReturn(period1, period2)));
    }
}
