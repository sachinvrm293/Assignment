package com.greatlearning.corejava3;

import com.greatlearning.corejava4.SuperDepartment;

 public  class AdminDepartment extends SuperDepartment {
    public void departmentName(String A) {
    System.out.println("Admin Department");
  }
  public void getTodaysWork(){
  System.out.println("Complete your documents submission");
  }
  public void getWorkDeadline(){
  System.out.println("Complete by EOD");
  }
  }
