package dogfight.Model;

import java.util.ArrayList;

public class DogfightModel implements IDogfightModel {

	public IMobile Mobile;
	
	public DogfightModel(){
	}
	
	public IArea getArea(){
		return null;
	}
	
	public void buildArea(Dimension dimension){
	}
	
	public void addMobile(IMobile Mobile){
	}
	
	public void removeMobile(IMobile Mobile){
	}
	
	public ArrayList<IMobile> getMobiles(){
		return null;
	}
	
	public IMobile getMobileByPlayer (int player){
		return Mobile;
	}
	
	public void setMobilesHavesMoved(){
	}
}
