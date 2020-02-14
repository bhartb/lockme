package com.bibhas.lockme.registration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import com.bibhas.lockme.login.ValidateUser;
import com.bibhas.lockme.model.UserDetail;

public class Registration implements Serializable {
	
       /**
	 *  @author bhartb
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	
	private String userPassword;
	UserDetail userDetl;
	
	public  void doRegistration() throws Exception{
		
		
		System.out.println("");
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your username:");
		 userName=scan.nextLine();
		
		
        System.out.println("Please enter your password:");
		 userPassword=scan.nextLine();
		 
		  userDetl=new UserDetail(userName, userPassword);
		
		 
		 
		sucessRegistn();
		
	}
	
	void sucessRegistn() throws Exception {
		
		
		if(!userName.isEmpty() && !userPassword.isEmpty()) {
			
			
			
			try {
				
				FileOutputStream fil = new FileOutputStream(new File("database.txt"),true);
				ObjectOutputStream obj = new ObjectOutputStream(fil);

				// Write objects to file
				
			
					obj.writeObject(userDetl.toString());
					
					//obj.writeObject(userPassword);
					
					
				
				
				

				obj.close();
				fil.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			System.out.println("Registration Success");
			System.out.println("");
			System.out.println("**********Welcome to the Login page**********");
			ValidateUser val=new ValidateUser();
			val.validateUser();
			
		}else {
			System.out.println("Username or password can't be empty. Please do again Registarion");
			doRegistration();
		}
		
	}
		
	

}
