package abst_;

public class DeskPhone implements Telephone {
	private int myNumber;
	
	DeskPhone(int myNumber){
		this.myNumber = myNumber;
	}
	public void powerOn(){
		System.out.println("Power on...");
	}
	public void dialNumber(int number){
		System.out.println("Dialing " + number);
	}
	public void  call(int number){
		System.out.println("calling " + number);
	}
	public void answer(int number){
		if(myNumber == number){
			System.out.println("Answering...");
		}else {
			System.out.println("Wrong number.");
		}
	}
	
}
