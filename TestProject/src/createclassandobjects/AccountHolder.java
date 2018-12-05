package createclassandobjects;

public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	float accountBal;
	boolean eligibleForCreditCard;
	
	
	public void testEligibleForCreditCard()
	{
		if(age>21 && accountBal>=20000)
		{
			eligibleForCreditCard = true;
		}
	}
	
}
