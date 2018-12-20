package mock;

import app.interfaces.ITechnology;
import app.technology.Unite;

public class MockTechnology implements ITechnology{

	public Unite getOuvrier() {
		return new Unite("ouvrier");
	}

	public Unite getSoldat() {
		return new Unite("soldat");
	}

	@Override
	public Unite createUnite(int nb_po, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
