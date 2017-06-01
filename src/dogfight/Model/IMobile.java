package dogfight.Model;

import java.awt.Image;
import java.awt.Point;

public interface IMobile {

	public default Direction getDirection() {
		return null;
	}

	public default void setDirection(Direction direction) {
	}

	public default Point getPosition() {
		return null;
	}

	public default Dimension getDimension() {
		return null;
	}

	public default int getWidht() {
		return 0;
	}

	public default int getHeight() {
		return 0;
	}

	public default int getSpeed() {
		return 0;
	}

	public default Image getImage() {
		return null;
	}

	public default void getMove() {
	}

	public default void placeInArea(IArea area) {
	}

	public default boolean isPlayer(int player) {
		return false;
	}

	public default boolean setDogfightModel(DogfightModel dogfightmodel) {
		return false;
	}

	public default boolean hit() {
		return false;
	}

	public default boolean isWeapon() {
		return false;
	}

}
