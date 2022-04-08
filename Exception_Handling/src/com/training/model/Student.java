package com.training.model;
import java.util.*;
import com.training.exception.RangeCheckException;

public class Student {
	private int rollNumber;
	private String firstName;
	private double markScored;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	public double getMarkScored1() {
		return markScored;
	}

	
	public void setMarkSheet(double markScored) throws Exception {
		if(markScored<0) { 
          try {
				
			throw new RangeCheckException("mark should be positive integer [0-100]");
		} catch (RangeCheckException e) {
		System.out.println();
		}
		}
		else {
			this.markScored = markScored;
		}
		
}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[rollNumber=" + rollNumber + ", firstName=" + firstName +", markScored+" + markScored +"]";
	}
	
	
	}
	
	

	


