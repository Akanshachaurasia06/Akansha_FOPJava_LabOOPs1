package com.gl1.com;

import java.security.SecureRandom;
import java.util.Scanner;

public class Employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fn,ln,de="";
		System.out.println("Enter your firstname");
		Scanner sc = new Scanner(System.in);
		fn=sc.nextLine();
		System.out.println("Enter your lastname");
		ln= sc.nextLine();
		Employeedetails obj = new Employeedetails(fn,ln);
	
		System.out.println("Please select you department form following option \n 1. Technical \2.Admin 3.Human Resource \4.Legal");
		int i = sc.nextInt();
		if(i==1)
		{
			de = "tech";
		}else if(i==2) {
			de = "admin";
		}else if(i==3) {
			de = "hr";
		}else if(i==4) {
			de = "legal";
		}else {
			System.out.println("Invalid option");
		}
System.out.println("Email --->" + fn+ln+"@"+ de+".abc"+".com");
		
		String pwd = generatepwd();
		System.out.println("Password ---> "+pwd );
	}

	private String fn;
	private String ln;
		Employeedetails(String firstname, String lastname){ 
		this.fn = firstname;
		this.ln = lastname;
		}
		
	
	
	private static void name(String fn, String ln) {
            System.out.println("Dear "+ fn +" your generated credentials are as follows");
		
	}

	private static String generatepwd() {
		  final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		  
	        SecureRandom random = new SecureRandom();
	        StringBuilder sb = new StringBuilder();
	           int len=7;
	        // each iteration of the loop randomly chooses a character from the given
	        // ASCII range and appends it to the `StringBuilder` instance
	 
	        for (int i = 0; i < len; i++)
	        {
	            int randomIndex = random.nextInt(chars.length());
	            sb.append(chars.charAt(randomIndex));
	        }
	 
	        return sb.toString();
	}

}
