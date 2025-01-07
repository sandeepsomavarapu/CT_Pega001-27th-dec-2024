package com.cts.exceptions;//our class should extends exception,Throwable
//parameterized constructor
class MyException1 extends Exception
{
	private int age;
	public MyException1(int age) 
	{
		this.age=age;
	}
	public String toString() {
		return "you are not eligable for vote"+age;
	}}
public class Exception6 
{
	static void validation(int age) throws MyException1  
       {
     if(age<18)
    	
        throw new MyException1(age);//MyException1 obj
     else
      System.out.println("you are eligable to vote");
   }  
   public static void main(String args[]) throws MyException1 
      {
				Exception6.validation(16);
      System.out.println("rest of the code...");
      }
   }