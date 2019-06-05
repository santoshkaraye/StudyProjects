package main.java;

import java.util.Arrays;

public class ImmutableClass {

	
	public static void main(String args[])
	{
		char [] str= new char[10];
		
		str[0]='a';
		str[1]='b';
		
		Age age = new Age();
	    age.setDay(1);
	    age.setMonth(1);
	    age.setYear(1992);
		
		Immutable imp = new Immutable(10,20,str, age);
		
		System.out.println("i=" +imp.getA());
		System.out.println("i=" +imp.getB());
		System.out.println("char array" +Arrays.toString(imp.getStr()));
		str[2]='c';
		System.out.println("char array" +Arrays.toString(imp.getStr()));
	}
		
}


 class Immutable{
	private int a;
	private int b;
	private char[] str;
	private final Age age;
	
	Immutable(int a, int b, char[] str, Age age)
	{
		this.a=a;
		this.b=b;
		this.str=Arrays.copyOf(str, str.length);
		
		Age cloneAge = new Age();
	    cloneAge.setDay(age.getDay());
	    cloneAge.setMonth(age.getMonth());
	    cloneAge.setYear(age.getYear());
	    this.age = cloneAge;
	}
	
	public Age getAge() {
	    Age cloneAge = new Age();
	    cloneAge.setDay(this.age.getDay());
	    cloneAge.setMonth(this.age.getMonth());
	    cloneAge.setYear(this.age.getYear());
	    return cloneAge;
	}
	
	public int getA()
	{
		return a;
	}
	
	public int getB()
	{
		return b;
	}
	
	public char[] getStr()
	{
		return str;
	}
}
 
 
  class Age {
	    private int day;
	    private int month;
	    private int year;
	    public int getDay() {
	        return day;
	    }
	    public void setDay(int day) {
	    this.day = day;
	    }
	    public int getMonth() {
	    return month;
	    }
	    public void setMonth(int month) {
	    this.month = month;
	    }
	    public int getYear() {
	    return year;
	    }
	    public void setYear(int year) {
	    this.year = year;
	    }
	}
