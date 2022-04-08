package com.training.services;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;
// A class can only extend another class but it can implements one or more interface

public class CurrencyConvertor implements Function,CheckCondition {

	@Override
	public double apply(double value) {
		// TODO Auto-generated method stub
		return value*100;
	}

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return false;
	}

}
