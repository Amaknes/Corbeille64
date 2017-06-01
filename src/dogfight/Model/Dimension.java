package dogfight.Model;

public class Dimension  {

	private int widht;
	private int height;
	
	public Dimension (int widht, int height){
		this.widht=widht;
		this.height=height;
	}
	public Dimension(Dimension dimension){	
	}
	
	
	public int getWidht() {
		return widht;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
