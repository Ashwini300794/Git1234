package com.cjc.serviceimplementation;

import java.util.Scanner;

import com.cjc.model.Course;
import com.cjc.model.Faculty;

public class InstituteImpl {
	Scanner sc=new Scanner(System.in);
Course c=new Course();
Faculty f=new Faculty();

public void addCourse()
{
	
System.out.println("Enter cid");
c.setCid(sc.nextInt());
System.out.println("Enter course name");
c.setName(sc.next());

}
 public void viewCourse()
 {
	 System.out.println("cid = " +c.getCid());
	 System.out.println("course name ="+c.getName());
 }
 
 public void addFaculty()
 {
	 System.out.println("Enter Fid = ");
	 f.setFid(sc.nextInt());
	 System.out.println("Enter Fname = ");
	 f.setFname(sc.next());
	 
 }
 
 public void viewFaculty()
 {
	 System.out.println("fid is ="+ f.getFid());
	 System.out.println("fname is = "+ f.getFname());
	 
 }
}
