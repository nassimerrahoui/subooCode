package mock;

import app.interfaces.ITechnology;
import app.technology.Unite;

public class MockTechnology implements ITechnology {
	
	public Unite createUnite() {
		return new Unite(50, 1, 30, "Ouvrier");
	}

	@Override
	public Unite createUnite(int nb_po, String name) {
		return null;
	}
}
