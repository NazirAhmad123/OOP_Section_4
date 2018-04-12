package composition;

public class Case {
	private String model;
	private String manufecture;
	private Dimension dimension;
	
	public Case(String model, String manufecture, Dimension dimension) {
		this.dimension = dimension;
		this.model = model;
		this.manufecture = manufecture;
	}

	public void pressPowerButton(){
		System.out.println("Power button is pressed.");
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

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	
	
	
	

}
