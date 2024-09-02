package com.springCore;

public class Student {
private int studentId;
private String studentNmae;
private String studentAddress;



public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentNmae() {
	return studentNmae;
}
public void setStudentNmae(String studentNmae) {
	this.studentNmae = studentNmae;
}

public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public Student(int studentId, String studentNmae, String studentAddress) {
	super();
	this.studentId = studentId;
	this.studentNmae = studentNmae;
	this.studentAddress = studentAddress;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentNmae=" + studentNmae + ", studentAddress=" + studentAddress
			+ "]";
}

}
