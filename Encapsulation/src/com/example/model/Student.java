package com.example.model;

public class Student {
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
private int rollNumber;
private String firstName;
private String branch;

public Student(int rollNumber, String firstName, String branch) {
	this(rollNumber, firstName, 99, branch);
	this.rollNumber = rollNumber;
	this.firstName = firstName;
	this.branch = branch;
}
public Student(int rollNumber, String firstName, String branch, double markScored) {
	super();
	this.rollNumber = rollNumber;
	this.firstName = firstName;
	this.branch = branch;
	this.markScored = markScored;
}
public Student(int rollNumber2, String firstName2, int i, String branch2) {
	// TODO Auto-generated constructor stub
}
public String getBranch() {
	return branch;
}
private void setBranch(String branch) {
	this.branch = branch;
}
private double markScored;
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public String getFirstName() {
	return firstName;
}

void setFirstName(String firstName) {
	this.firstName = firstName;
}
public double getMarkScored() {
	return markScored;
}
protected void setMarkScored(double markScored) {
	this.markScored = markScored;
}

}
