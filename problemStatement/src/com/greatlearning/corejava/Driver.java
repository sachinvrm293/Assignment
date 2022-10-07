package com.greatlearning.corejava;
import com.greatlearning.corejava1.*;
import com.greatlearning.corejava2.*;
import com.greatlearning.corejava3.*;
import com.greatlearning.corejava4.*;
  
 public class Driver{
	public static void main(String[]args) {
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		SuperDepartment super1 = new SuperDepartment();
		admin.departmentName("a");
	
		admin.getTodaysWork();
		hr.getWorkDeadline();
		tech.getTechStackInformation();
		super1.getTodaysWork();
		System.out.println("Welcome to " + admin.departmentName("a"));
	}
	

}

 