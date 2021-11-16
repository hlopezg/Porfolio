/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.porfolio;

/**
 *
 * @author hecto
 */

import java.util.HashMap;
import java.util.Map;

public class Stock {
    private final Map <Integer, Double> stockList = new HashMap<>();

    public void addPrice(Integer period, Double price) {
            stockList.put(period, price);	
    }

    public Double getPrice(Integer period) {
            return stockList.get(period);

    }

    public Double stockProfit(Integer period1, Integer period2) {
        return overallReturn(period1, period2);
    }
    
    public Double annualizedReturn(Integer period1, Integer period2){
        Double overallReturn = overallReturn(period1, period2);
        Double N = period2 - period1 + 1d;
        return Math.pow((1 + overallReturn), (1 / N)) -1;
    }
    
    // (ending value - beginning value) / beginning value
    private Double overallReturn(Integer period1, Integer period2){
        return ( stockList.get(period2) - stockList.get(period1) ) / stockList.get(period1);
    }
}
