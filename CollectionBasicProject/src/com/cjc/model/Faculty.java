package com.cjc.model;

import java.util.HashSet;
import java.util.Set;

public class Faculty {
private int fid;
private String fname;
Set<Course> c= new HashSet();
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public Set<Course> getC() {
	return c;
}
public void setC(Set<Course> c) {
	this.c = c;
}

}
