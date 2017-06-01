package dogfightview;

import gameframe.GameFrame;

public class DogfightView implements Runnable, IViewSystem {
	//=========ATTRIBUTES===========//
	private EventPerformer eventPerformer;
	private GameFrame gameFrame;
	private GraphicsBuilder graphicsBuilder;
	
	//=========CONSTRUCTOR========//
	  public DogfightView() {
	eventPerformer = new EventPerformer();
	gameFrame = new GameFrame();
	graphicsBuilder = new GraphicsBuilder();
	}


	//=========METHODS============//
	public EventPerformer getEventPerformer() {
		return eventPerformer;
	}

	public void setEventPerformer(EventPerformer eventPerformer) {
		this.eventPerformer = eventPerformer;
	}

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public String displayMessage(String message) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		
	}
}
