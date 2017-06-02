package dogfight.Model;

public class Missile extends Mobile {

	private int SPEED=4;
	private int WIDHT=30;
	private int HEIGHT=10;
	private int MAX_DISTANCE_TRAVELED=100;
	private String image ="missile";
	private int distanceTraveled = 0;
	
	public Missile (Direction direction, Dimension dimension){
	}
	
	public int getWidhtADirection(Direction direction){
		return 1;
		
	}
	public int getHeightADirection(Direction direction){
		return 1;
	}
	
	public void move(){
	}
	
	public boolean isWeapon(){
		return false;
	}


}
