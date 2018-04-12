package composition;

public class Computer {
//	Case
//	Monitor
//	Motherboard
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	
	public Computer(Case theCase, Monitor monitor, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp(){
		theCase.pressPowerButton();
		drawLogo();
		motherboard.loadProgram("Windows 10 ...");
		
	}
	
	public void drawLogo(){
		monitor.drawPixelsAt(12, 12, "Blue");
	}

	public Case getTheCase() {
		return theCase;
	}


	public void setTheCase(Case theCase) {
		this.theCase = theCase;
	}


	public Monitor getMonitor() {
		return monitor;
	}


	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}


	public Motherboard getMotherboard() {
		return motherboard;
	}


	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}
	
	
	
	

}
