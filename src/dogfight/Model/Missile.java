package dogfight.Model;

public class Missile {

	private int SPEED=4;
	private int WIDHT=30;
	private int HEIGHT=10;
	private int MAX_DISTANCE_TRAVELED=100;
	private String image ="missile";
	private int distanceTraveled = 0;
	
	public Missile (Direction direction, Dimension dimension){
	}
	
	public int getWidhtADirection(Direction direction){
		return ;
	}
	public int getHeightADirection(Direction direction){
		return HEIGHT;
	}
	
	public void move(){
	}
	
	public boolean isWeapon(){
		return false;
	}


}
