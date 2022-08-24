package demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Getter
public class PersonalFinanceManagerPro extends PersonalFinanceManager{
	private int AccountPRO;
	private int AccountOverDraftBalance;
	private String AccountDetails = "AccountDetailsFromPro";

	public String getAccountDetails(){

		return super.getAccountDetails();
	}
	public void setAccountDetails( String AccountDetails){

	this.AccountDetails= AccountDetails;
	}


}
