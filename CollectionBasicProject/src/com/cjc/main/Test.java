package com.cjc.main;

import java.util.Scanner;

import com.cjc.serviceimplementation.InstituteImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InstituteImpl i=new InstituteImpl();
Scanner sc = new Scanner(System.in);
System.out.println("1. AddCourse \n 2.ViewCourse \n 3.AddFaculty \n 4.ViewFaculty");
int n;
		int 6tyh7uu8

do
{
System.out.println("Enter a choice");
n=sc.nextInt();

switch(n)
{
case 1: i.addCourse();
       break;
       
case 2: i.viewCourse();;
       break;
case 3: i.addFaculty();
       break;
case 4: i.viewFaculty();
       break;
}

}while(n!=0);
	}

}
