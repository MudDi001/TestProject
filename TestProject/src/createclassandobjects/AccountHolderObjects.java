package createclassandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccountHolder divya = new AccountHolder();
AccountHolder kavya = new AccountHolder();

divya.firstName = "Divya";
divya.lastName = "Muddaiah";
divya.age = 27;
divya.accountBal = 30000;
divya.testEligibleForCreditCard();
System.out.println("Is Divya Eligible:" + divya.eligibleForCreditCard);

kavya.firstName = "Kavya";
kavya.lastName = "Muddaiah";
kavya.age = 21;
kavya.accountBal = 10000;
kavya.testEligibleForCreditCard();
System.out.println("Is Kavya Eligible:" + kavya.eligibleForCreditCard);


}
}
