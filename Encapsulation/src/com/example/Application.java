package com.example;
import com.example.model.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student ram = new Student();
ram.setRollNumber(65479);//default method unable to access=>
//because student class is in com.example.model package
//and Application is in com.example package
//ram.setFirstName("Ram");
//unable to access because Application is NOT a subclass
//of student
System.out.println("Roll Number :="+ram.getRollNumber());
System.out.println("Mark Scored :="+ram.getMarkScored());
System.out.println("Student Name:="+ram.getFirstName());
Student shyam = new Student(490, "shyam", 89, "EC");
System.out.println("Roll Number:="+shyam.getRollNumber());
System.out.println("Student Name :="+shyam.getFirstName());
Student Surya = new Student(35, "Surya", "EC");
System.out.println("Roll Number :=" +Surya.getRollNumber());
System.out.println("Mark Scored :=" +Surya.getMarkScored());

	}
	}