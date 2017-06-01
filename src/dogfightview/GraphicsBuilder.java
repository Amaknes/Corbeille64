package dogfightview;
import java.awt.image.BufferedImage;

import dogfight.Modele.IDogfightModel;
import gameframe.IGraphicsBuilder;


public class GraphicsBuilder implements IGraphicsBuilder {
	//=========ATTRIBUTES===========//
	private BufferedImage emptySky;
	private IDogfightModel dogfightModel;

	//=========METHODS============//

	public BufferedImage getEmptySky() {
		return emptySky;
	}

	public void setEmptySky(BufferedImage emptySky) {
		this.emptySky = emptySky;
	}

	public IDogfightModel getDogfightModel() {
		return dogfightModel;
	}

	public void setDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	private void buildEmptySky(){
		
	}
}
