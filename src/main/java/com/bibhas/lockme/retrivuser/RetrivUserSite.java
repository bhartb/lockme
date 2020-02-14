package com.bibhas.lockme.retrivuser;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class RetrivUserSite{
	
	public void userDetails() {
		
		
	      
	      Map<String, String[]> userMap = new HashMap<String, String[]>();
	        String[] userInformationArray = new String[]{"siteName", "userName", "userPassword"};
	       String user="USER";
	       userMap.put(user, userInformationArray);
	       Collection<String> coll=userMap.keySet();

	}
}