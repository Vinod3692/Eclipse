package com.xworkz;

import com.xworkz.market.base.SuperMarket;
import com.xworkz.market.online.OnlineMarket;

public class MarketRunner {

	public static void main(String[] args) {

		SuperMarket ref = new SuperMarket();
		ref.sell(); 
		
		OnlineMarket ref1 = new OnlineMarket();
		
		ref1.buy();  
	}

}