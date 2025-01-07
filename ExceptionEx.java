package com.cts.exceptions;

public class ExceptionEx {
	public static void main(String[] args)throws Exception {
		int a = 20;
		int b = 0;
		try {
		int result = a / b;//abnormal termination
		System.out.println("division of two numbers..." + result);
		}catch(ArithmeticException exception)
		{
			System.out.println("denominator cannot be zero");
		}
		System.out.println("remaining 1000 lines ");
	}
}
