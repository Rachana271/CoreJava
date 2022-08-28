package com.domain;

public class StudentIdnotfound extends Exception 
{
	 int sid;
	 StudentIdnotfound()
	 {
		 
	 }
	public StudentIdnotfound(int sid) 
	{
		this.sid = sid;
	}
	 @Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "student with id "+sid+" Not found";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student id not Found";
	}
	
}