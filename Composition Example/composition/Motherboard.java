package composition;

public class Motherboard {
	private String model;
	private String manufecture;
	public Motherboard(String model, String manufecture) {
		super();
		this.model = model;
		this.manufecture = manufecture;
	}
	
	public void loadProgram(String programName){
		System.out.println(programName + " is loading now ...");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufecture() {
		return manufecture;
	}
	public void setManufecture(String manufecture) {
		this.manufecture = manufecture;
	}
	
	
}	
