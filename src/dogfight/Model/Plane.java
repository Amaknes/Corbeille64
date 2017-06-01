package dogfight.Model;

public class Plane extends Mobile{

	private int SPEED=2;
	private int WIDHT=100;
	private int HEIGHT=30;
	private int player;
	
	public Plane(int player, Direction direction, Position position, String image){
	}
	
	public boolean isPlayer (int player){
		return false;
	}
	
	public boolean hit (){
		return false;
	}
}
