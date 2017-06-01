package dogfightview;

import dogfight.Controller.IOrderPerformer;
import gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	//=========ATTRIBUTES===========//
	private IOrderPerformer orderPerformer;

	//=========METHODS============//
	public IOrderPerformer getOrderPerformer() {
		return orderPerformer;
	}

	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
}
