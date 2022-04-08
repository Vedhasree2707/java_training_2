package com.training.services;

public class ExceptionHandling {
	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Method requires three values to be passed[1,2,3]");
			//e.printStackTrace();
		}
		
	}

	public void usingNumberFormatException(String value) {
		int age = 0;
		try
		{
			age = Integer.parseInt(value);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();	
		}
		System.out.println(age);
		
		
	}
	public String underStandFinallyBlock() {
		int denominator = 4;
		try {
			System.out.println(4/denominator);
		} catch(ArithmeticException e) {
			System.err.println("Denominator should not be zero");
			return "welcome";
	
		}
		finally {
			System.out.println("Inside FINALLY==");
		
		}
		System.out.println("Thanks, bye, bye");
		return "thanks";
		}

	
	}

	
	

	

