package dogfight.Model;

public class Cloud extends Mobile{

	private int SPEED = 1;
	private int WIDHT = 300;
	private int HEIGHT = 150;
	private String IMAGE= "cloud";
	public Direction direction;
	public Dimension dimension;
	
	public Cloud (Direction direction, Dimension dimension){
		this.direction=direction;
		this.dimension=dimension;
	}
}
