package dogfight.Model;

import java.util.ArrayList;

public interface IDogfightModel {

	public default IArea getArea(){
		return null;
	}
	
	public default void buildArea(Dimension dimension){
	}
	
	public default void addMobile(IMobile Mobile){
	}
	
	public default void removeMobile(IMobile Mobile){
	}
	
	public default ArrayList<IMobile> getMobiles(){
		return null;
	}
	
	public default IMobile getMobileByPlayer (int player){
		return null;
	}
	
	public default void setMobilesHavesMoved(){
	}
}
