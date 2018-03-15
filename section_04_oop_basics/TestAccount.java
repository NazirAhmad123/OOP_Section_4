package section_04_oop_basics;

public class TestAccount {
	public static void main(String[] args) {
		
//		Account account1 = new Account();
//		account1.deposit(500.0);
//		account1.deposit(1000.0);
//		account1.withdrawal(1000);
//		account1.withdrawal(600);
		
//		Account acc = new Account("FT123454", 100.0, "Ahmad","ahmad@email.com"
//				,"011 11 256");
//		acc.setAccNumber("B10001234");
//		acc.setBalance(500);
//		acc.setCustName("Ali");
//		acc.setCustEmail("ali@email.com");
//		acc.setCustPhoneNumber("123 45 678");
		
//		System.out.println("Name: " + acc.getCustName());
//		System.out.println("Account number: " + acc.getAccNumber());
//		System.out.println("Balance: " + acc.getBalance());
//		System.out.println("Email: " + acc.getCustEmail());
//		System.out.println("Phone: " + acc.getCustPhoneNumber());
//		
//		Account acc2 = new Account("John","john@email.com","12346567");
//		System.out.println(acc2.getBalance());
//		System.out.println("Name: " + acc2.getCustName());
		
		// Create a new class called VipCustomers
		// It should have 3 fields, name, credit limit and email address
		// Create three constructors
		// 1th constructor empty should call the constructor with 3 parameters 
		// with default values
		// 2th constructor should pass on the two values it receives and add a
		// default value for te third
		// 3th constructor should save all the fields
		// Create getters to test if they work.
		
		VipCustomers vip1 = new VipCustomers();
		
		System.out.println("Name: " + vip1.getName());
		System.out.println("Credit Limit: " + vip1.getCreditBalance());
		System.out.println("Email: " + vip1.getEmail());
		
		VipCustomers vip2 = new VipCustomers("tim",400, "tim@email.com");
		
		System.out.println("Name: " + vip2.getName());
		System.out.println("Credit Limit: " + vip2.getCreditBalance());
		System.out.println("Email: " + vip2.getEmail());
		
		VipCustomers vip3 = new VipCustomers("farid", 50);
		
		System.out.println("Name: " + vip3.getName());
		System.out.println("Credit Limit: " + vip3.getCreditBalance());
		System.out.println("Email: " + vip3.getEmail());
		
		
		
		
	}

}
