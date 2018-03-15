package section_04_oop_basics;

public class Account {
	private String accNumber;
	private double balance;
	private String custName;
	private String custEmail;
	private String custPhoneNumber;
	
	Account(){
		this("Default acc num",1500,"Default name","Default email", 
				"Default phone #");
		System.out.println("Default constructor was called.");
		}
	
	Account(String accNumber, double balance, String custName,
			String custEmail, String custPhoneNumber){
		System.out.println("Constructor with parameter was called.");
		this.accNumber = accNumber;
		this.balance = balance;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custPhoneNumber = custPhoneNumber;
	}
//	Constructor overloading
	Account(String custName, String custEmail, String custPhoneNumber){
		this("E0984534",5000,custName, custEmail,custPhoneNumber);
	}
	
	public void deposit(double depositAmount){
		this.balance += depositAmount;
		System.out.println("A deposit of" + depositAmount + " was made.");
		System.out.println("Your new balance is " + this.balance);
	}
//	Withdrawal  method
	public void withdrawal(double withdrawalAmount){
		//this.balance -= withdrawalAmount;
		if(this.balance - withdrawalAmount <= 0){
			System.out.println("Only " + this.balance + " is available.");
			System.out.println("Transaction failed.");
		}else {
			this.balance -= withdrawalAmount;
			System.out.println("A withdrawal of " + withdrawalAmount + 
					" was made.");
			System.out.println("Your new balance is: " + this.balance);
			
		}
	}
	public String getAccNumber() {
		return accNumber;
	}
//	public void setAccNumber(String accNumber) {
//		this.accNumber = accNumber;
//	}
	public double getBalance() {
		return balance;
	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	public String getCustName() {
		return custName;
	}
//	public void setCustName(String custName) {
//		this.custName = custName;
//	}
	public String getCustEmail() {
		return custEmail;
	}
//	public void setCustEmail(String custEmail) {
//		this.custEmail = custEmail;
//	}
	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}
//	public void setCustPhoneNumber(String custPhoneNumber) {
//		this.custPhoneNumber = custPhoneNumber;
//	}
//	

}
