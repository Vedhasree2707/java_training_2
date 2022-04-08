package com.training.services;
import com.training.model.Student;
public class StudentService { 
	private Student student;

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentService(Student student) {
		super();
		this.student = student;
	}
	// applying the handle rule of exception handling
	
	public String sendDetails() {
		String message = null;
		try {
			message = this.student.getFirstName();
		}
		catch (NullPointerException e) {
			System.err.println("Student object is not passed check again");
		}
		return message;
		//applying 
	}
	public String findRank()throws NullPointerException{
		String grade = "A";
		if(this.student.getMarkScored()>90) {
			grade = "0";
					
		}
		return grade;
	}

}
