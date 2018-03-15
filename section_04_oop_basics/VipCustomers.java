package section_04_oop_basics;

public class VipCustomers {
	private String name;
	private double creditBalance;
	private String email;
	
//	 Default constructor with no parameter
	VipCustomers(){
		this("Deafualt name",6000, "Default Email Address");
	}
//	 Constructor with all the parameters
	VipCustomers(String name, double cL, String email){
		this.name = name;
		this.creditBalance = cL;
		this.email = email;
	}
//	Constructor with only two parameters
	VipCustomers(String name, double cL){
		this(name, cL, "default@email.com");
		
	}
	public String getName() {
		return name;
	}
	public double getCreditBalance() {
		return creditBalance;
	}
	public String getEmail() {
		return email;
	}
	

}
