package com.training;
import java.util.*;

import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Student ram = new Student();
		StudentService service = new StudentService( ram );
		System.out.println(service.sendDetails());
		Student raj = new Student();
		raj.getRollNumber();
		raj.getFirstName();
		raj.getMarkScored();
		
		StudentService service2 = new StudentService(ram);
		try {
			System.out.println("grade:="+service2.findRank());
		} catch (Throwable e) {
				
		
		System.err.println("name is not passed");
		}

	
	ExceptionHandling exHandling = new ExceptionHandling();
	exHandling.usingArrayIndexException(args);
	exHandling.usingNumberFormatException("45");
	System.out.println(exHandling.underStandFinallyBlock());
	try(Scanner scan = new Scanner(System.in)){
		System.out.println("enter number");
		int num = scan.nextInt();
		System.out.println(num);
		
		
	} catch (Exception e){
		e.printStackTrace();
	}
	
		
	
	}
}
	
