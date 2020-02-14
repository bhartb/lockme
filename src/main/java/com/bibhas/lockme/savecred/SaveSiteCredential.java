package com.bibhas.lockme.savecred;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

import com.bibhas.lockme.main.LockMe;
import com.bibhas.lockme.model.UserCredential;
import com.bibhas.lockme.model.UserDetail;
import com.bibhas.lockme.retrivuser.RetrivUserSite;

public class SaveSiteCredential implements Serializable {
	
	/**
	 * @author bhartb
	 */
	private static final long serialVersionUID = 1L;
	String siteName;
	String userEmail;
	String userPassword;
	String usrResp;
	String siteExist;
	FileOutputStream fil;
	FileOutputStream updtdfil;
	
	
	public void saveSiteCred() throws IOException {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Social Site Name");
		siteName=sc.next();
		System.out.println("Enter Login Email");
		userEmail=sc.next();
		System.out.println("Enter Site password");
		userPassword=sc.next();
		
		HashMap<String,String> map1 = new HashMap<String, String>();
		
		map1.put(siteName, userEmail);
		
		
		
	
		sucessSiteCredential();
		
	}
	
void sucessSiteCredential() throws IOException {
		
		if(!siteName.isEmpty() && !userPassword.isEmpty() && !userEmail.isEmpty()) {
			
		
				
				
			
			
			try {
				
				 fil = new FileOutputStream(new File("locker-file.txt"),true);
				ObjectOutputStream obj = new ObjectOutputStream(fil);
				
				
                 
				// Write objects to file
				obj.writeObject(siteName);
				obj.writeObject(userEmail);
				obj.writeObject(userPassword);
				

				obj.close();
				fil.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			System.out.println("Successfully Saved Credentials for the SocialSite");
			System.out.println("Want to continue Register for more sites:Y/N");
			Scanner sc=new Scanner(System.in);
			usrResp=sc.next().toUpperCase();
			
			if(usrResp.contains("Y")) {
				
				saveSiteCred();
				
			}else {
				

			      System.out.println("Thank you");
			      System.out.println("User Details Matrix");
			      RetrivUserSite retrv= new RetrivUserSite();
			      retrv.userDetails();
			        
			}
			
			
			
		}else {
			System.out.println("Username or email or password can't be empty. Please do again Registarion for Site");
			saveSiteCred();
		}
		
	}
	
	

}
