package com.bridgelab.commericaldataprocessing;

import stockaccountmanagement.StockCatagories;
public class Company {

	private String stocksymbol;
	public Company company;
	public StockCatagories stockcatagories;
	
	
	public String getStockSymbol() {
		return stocksymbol;
	}
	
	public void setStockSymbol(String stockSymbol) {
		this.stocksymbol = stockSymbol;
	}

}
