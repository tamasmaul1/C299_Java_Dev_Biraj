package demo;

import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Lets Play");
		
		
		List<AppUser> AccountList = new LinkedList<AppUser>();
		
		for (int i =0 ;i<10 ;i++) {
			
			AppUser tempAppUser = new AppUser(); 
			
			Account account = new Account();
			account.setAccountNumber(i);
			account.setAccountBalance(i^i);
			
			Address address = new Address();
			address.setCountry("Country_Name_"+i);
		
			tempAppUser.setAccount(account);
			tempAppUser.setAddress(address);
			
			System.out.println(tempAppUser);
			
			AccountList.add(tempAppUser);
		}
		
		
		
		/*
		 * var FMS = new PersonalFinanceManagerService();
		 * FMS.createFinanceManager("","");
		 * 
		 * var tempcheck = new PersonalFinanceManagerPro();
		 * 
		 * tempcheck.getAccountDetails();
		 * 
		 * tempcheck.getAddress().getCountry(); tempcheck.getAddress();
		 */
		
		// Text - >
		//          Financial Records 
		//          AccountNumber AccountHolderAddress Balance
		//          ItemName ItemQuantity
		
		//          SocialMediaAccount - > Posts - > Label hashtags and description
		//          SocialMediaAccount[K][V] 
		//                               [Posts]
		//                                      [Labels]
		//                                      [HashTag]
		// Object - > Image > Profile Image
		// File -> Payslip of an employee or
		// Video -> Youtube Shorts 
		// Audio 
		

	}

}
