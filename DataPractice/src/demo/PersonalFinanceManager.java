package demo;

import lombok.Getter;
import lombok.Setter;


//POJO -> Plain Old Java Object

@Setter
@Getter

public class PersonalFinanceManager {
	
	private int AccountNumber;
	private int AccountBalance;
	private String AccountDetails = "AccountDetails";


	private Address Address ;

}
