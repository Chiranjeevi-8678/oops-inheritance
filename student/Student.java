package org.student;

import org.department.Department;

public class Student extends Department {
	public void StudentName() {
		System.out.println("Student Name is chiran");
	}
	public void studentDept() {
		System.out.println("studentDept is RoyalMech");
	}
	public void studentId() {
		System.out.println("student Id is 787167");
	}
	
	public static void main(String[] args) {
		Student str=new Student();
		str.StudentName();
		str.studentDept();
		str.studentId();
		str.collegeCode();
		str.collegeName();
		str.collegeRank();
		
	}

}
