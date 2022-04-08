package com.training.exception;
import java.io.PrintStream;
import java.io.PrintWriter;


	public class RangeCheckException extends Exception{
		private String message;
		public RangeCheckException(String message) {
			
		super();
		this.message = message;
		}
		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return super.getMessage();
		}
		
	}