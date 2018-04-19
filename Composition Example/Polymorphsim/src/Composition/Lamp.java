package sec4;

public class Lamp {
//	Style, battery
	private String style;
	private boolean battery;
	
	Lamp(String style, boolean battery){
		this.style = style;
		this.battery = battery;
	}

	public void turnOn(){
		System.out.println("Turn on the lamp.");
	}
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public boolean isBattery() {
		return battery;
	}

	public void setBattery(boolean battery) {
		this.battery = battery;
	}

	
}
