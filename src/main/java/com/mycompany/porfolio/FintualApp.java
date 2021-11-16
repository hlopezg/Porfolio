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

         /*   stock = portfolio.addStock("Microsoft");
            stock.addPrice(1, 20d);
            stock.addPrice(2, 40d);

            stock = portfolio.addStock("Apple");
            stock.addPrice(1, 200d);
            stock.addPrice(2, 300d);*/
            
            stock = portfolio.addStock("Fintual");
            stock.addPrice(1, 2000d);
            stock.addPrice(5, 5000d);


            /*System.out.println("Microsoft price on period 1: " + portfolio.getStock("Microsoft").getPrice(1));
            System.out.println("Microsoft price on period 2: " + portfolio.getStock("Microsoft").getPrice(2));
            System.out.println("Overall return of Microsoft between period 1 and period2: " + portfolio.getStock("Microsoft").stockProfit(1, 2));
            System.out.println("Annualized return of Microsoft between period 1 and period2: " + portfolio.getStock("Microsoft").annualizedReturn(1, 2));

            System.out.println("Apple price on period 1: " + portfolio.getStock("Apple").getPrice(1));
            System.out.println("Apple price on period 2: " + portfolio.getStock("Apple").getPrice(2));
            System.out.println("Overall return of Apple between period 1 and period2: " + portfolio.getStock("Apple").stockProfit(1, 2));
            System.out.println("Annualized return of Apple between period 1 and period2: " + portfolio.getStock("Apple").annualizedReturn(1, 2));
            */
            
            System.out.println("Fintual price on period 1: " + portfolio.getStock("Fintual").getPrice(1));
            System.out.println("Fintual price on period 2: " + portfolio.getStock("Fintual").getPrice(5));
            System.out.println("Overall return of Fintual between period 1 and period2: " + portfolio.getStock("Fintual").stockProfit(1, 5));
            System.out.println("Annualized return of Fintual between period 1 and period2: " + portfolio.getStock("Fintual").annualizedReturn(1, 5));


         /*   System.out.println("Overall return between period 1 and period 2: " + portfolio.profit(1, 2));
            System.out.println("Annualized return between period 1 and period 2: " + portfolio.portfolioAnnualizedReturn(1, 2));*/
    }
}
