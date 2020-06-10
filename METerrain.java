
public class METerrain extends Terrain{

	public METerrain(String filename) {
		super(filename);
		for(MEplace i: this.places) {
			i.updateNeighbour(this.places);
		}
	}

}
