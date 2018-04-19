package sec4;

public class Ceiling {
	private int height;
	private String paintedColor;
	
	Ceiling(int height, String pc){
		this.height = height;
		this.paintedColor = pc;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getPaintedColor() {
		return paintedColor;
	}

	public void setPaintedColor(String paintedColor) {
		this.paintedColor = paintedColor;
	}
	
	

}
