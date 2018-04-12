package composition;

public class Monitor {
	
	private String model;
	private String manufecture;
	
	private Resolution resolution;

	public Monitor(String model, String manufecture, Resolution resolution) {
		super();
		this.model = model;
		this.manufecture = manufecture;
		this.resolution = resolution;
	}

	public void drawPixelsAt(int x, int y, String color){
		System.out.println("Drawing pixerls at " + x + ", " + y + "in colour " + color);
		 
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

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
	
	

}
