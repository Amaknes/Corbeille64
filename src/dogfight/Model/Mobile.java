package dogfight.Model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {

	public Dimension dimension;
	public Position position;
	public Direction direction;
	public Image image;
	
	public Mobile(){}
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
	}

	public Direction getDirection() {
		return null;
	}

	public void setDirection(Direction direction) {
	}

	public Point getPosition() {
		return null;
	}

	public Dimension getDimension() {
		return null;
	}

	public int getSpeed() {
		return 0;
	}

	public int getWidht() {
		return 0;
	}

	public int getHeight() {
		return 0;
	}

	public void getMove() {
	}

	public void placeInArea(IArea area) {
	}

	public boolean isPlayer(int player) {
		return false;
	}

	private void moveUp() {
	}

	private void moveRight() {
	}

	private void moveDown() {
	}

	private void moveLeft() {
	}

	public Color getColor() {
		return null;
	}

	public IDogfightModel getDogfightModel() {
		return null;
	}

	public boolean setDogfightModel(DogfightModel dogfightmodel) {
		return false;
	}

	public boolean hit() {
		return false;
	}

	public boolean isWeapon() {
		return false;
	}

	public Image getImage() {
		return null;
	}
}
