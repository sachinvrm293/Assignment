package com.greatlearning.corejava2;

import com.greatlearning.corejava4.SuperDepartment;

  public class HrDepartment extends SuperDepartment {
    public void departmentName() {
    System.out.println("HR Department");
  }
  public void getTodaysWork(){
  System.out.println("Fill today's timesheet and mark your attendence");
  }
  public void getWorkDeadline(){
  System.out.println("Complete by EOD");
  }
  public void doActivitye(){
	  System.out.println("Team Lunch");
	  }
  }