package sec4;

public class Bed {
// Style, pillows,  sheets.
	private String style;
	private int pillows;
	private int sheets;
	
	Bed(String style, int pillows, int sheets){
		this.style = style;
		this.pillows = pillows;
		this.sheets = sheets;
	}

	public void make(){
		System.out.println("Making bed.");
	}
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getPillows() {
		return pillows;
	}

	public void setPillows(int pillows) {
		this.pillows = pillows;
	}

	public int getSheets() {
		return sheets;
	}

	public void setSheets(int sheets) {
		this.sheets = sheets;
	}
	
	
}
