package com.javalearning.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
	BigDecimal principle;
	BigDecimal interest;
	
	public SimpleInterestCalculator(String principle, String interest) {
		this.principle=new BigDecimal(principle);
		this.interest=new BigDecimal(interest).divide(new BigDecimal(100));
	}
	
	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalValue;
		
		BigDecimal noOfYearsBigDecimal =  new BigDecimal(noOfYears);
		
		totalValue = principle.add(principle.multiply(interest).multiply(noOfYearsBigDecimal));
		
		return totalValue;
	}
}
