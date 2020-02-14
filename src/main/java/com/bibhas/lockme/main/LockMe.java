package com.bibhas.lockme.main;

import java.util.Scanner;
import com.bibhas.lockme.login.ValidateUser;
import com.bibhas.lockme.registration.Registration;

/**
 * @author bhartb
 *
 */
public class LockMe 
{
	
	
	
    public static void main( String[] args ) throws Exception
    
    {
    	System.out.println("******************************************************************");
    	System.out.println("*                                                                *");
    	System.out.println("*                                                                *");
        System.out.println("*            !!!  Welcome to LockMe.com Project     !!!          *");
        System.out.println("*                                                                *");
        System.out.println("*                                                                *");
        System.out.println("******************************************************************");
       
        System.out.println("");
        Scanner scan=new Scanner(System.in);
		System.out.println("Are you an existing user:Y/N");
		String userRespone=scan.next().toUpperCase();
	
		if(userRespone.equals("Y")) {
			System.out.println("");
			System.out.println("");
			System.out.println("**********Welcome to the Login page**********");
			ValidateUser valUser=new ValidateUser();
			valUser.validateUser();
			
		}else {
			System.out.println("");
			System.out.println("");
			System.out.println("************Welcome to the Registration page***********");
		       Registration regis=new Registration();
		        regis.doRegistration();
		        
		}

		
        
    }

    
    
}
