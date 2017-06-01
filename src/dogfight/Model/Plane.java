package dogfight.Model;

public class Plane extends Mobile{

	private int SPEED=2;
	private int WIDHT=100;
	private int HEIGHT=30;
	private int player;
	
	public Plane (int player, Direction direction, Position position, String image){
	this.player=player;
	this.direction=direction;
	this.position=position;
	this.image=image;
	}
	
	public boolean isPlayer (int player){
	}
	
	public boolean hit (){
	}
}
