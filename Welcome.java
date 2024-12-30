package com.cts;
//ctrl+shift+f
public class Welcome {
	long contact=9494949494l;//global variable and instance
	static int countryCode=91;//global variable and static
	//main:the starting point of java app
	public static void main(String[] args) {
		//local variables
		byte age=21;
		float salary=23.89172818123193f;
		double salary1=23.89172818123193;
		char gender='M';
		boolean result=true;
		System.out.println(Welcome.countryCode);
		Welcome wel=new Welcome();
		System.out.println(wel.contact);
		
		System.out.println(age+" "+salary+" "+salary1+" "+gender+" "+result);
		
	}
}
//By default package available for every java file is java.lang
