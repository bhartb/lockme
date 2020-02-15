package com.bibhas.lockme.login;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bibhas.lockme.model.UserDetail;
import com.bibhas.lockme.registration.Registration;
import com.bibhas.lockme.savecred.SaveSiteCredential;

public class ValidateUser {
	
	/**
	 * @author bhartb
	 */
	private static final long serialVersionUID = 1L;
	
	String userNameDB;
	String userPasswordDB;
	String usrName;
	String usrPasswrd;
	String data;
	UserDetail usd;
	Object obj;
	ObjectInputStream oi;
	
	UserDetail us1;
	FileInputStream fis;
	
	List<Object> results = new ArrayList<Object>();
	

	@SuppressWarnings({ "unchecked", "unlikely-arg-type" })
	public void validateUser() throws Exception{
		
		Scanner usrDetails= new Scanner(System.in);
		System.out.println("Enter your username");

           usrName=usrDetails.next();
		System.out.println("Enter your password");
		 usrPasswrd=usrDetails.next();
		 
		 

				 fis = new FileInputStream(new File("database.txt"));
				
				try {
				

				
				while (true) {
		            ObjectInputStream ois = new ObjectInputStream(fis);
		            
		             results=(List<Object>)ois.readObject();
		            
		            if(results.toString().equals(usrName)); {
		            	
		            	 System.out.println("**********Welcome to the Login page**********");
		            	SaveSiteCredential sav=new SaveSiteCredential();
		            	sav.saveSiteCred();
		            }
		           System.out.println((results.add(ois.readObject().toString())));
	            	
		        }
			}catch (EOFException ignored) {
		        // as expected
		    } finally {
		        if (fis != null)
		            fis.close();
		    }
		    System.out.println("Sorry user name do not match. Please try again.");
		    Registration reg=new Registration();
		    reg.doRegistration();
		}
	}
	
	
