package com.training;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.services.CurrencyConvertor;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//subtype = new subtype
		//CurrencyConvertor conv = new CurrencyConvertor
		
		Function conv = new CurrencyConvertor();
		double response = conv.apply(200);
		System.out.println(response);
		System.out.println(conv.apply(300));
		System.out.println(conv.COUNTER);
		
		if(conv instanceof CheckCondition) {
			CheckCondition obj = (CheckCondition)conv;//casting
			System.out.println("Is Discount Allowed:'="+obj.test(300));
		}
		Conditional condObj = new DiscountCalculator();
		System.out.println(condObj.test(6000));
		System.out.println(condObj.negate(6000)); 
		System.out.println(conv instanceof CheckCondition);
		}

	}


