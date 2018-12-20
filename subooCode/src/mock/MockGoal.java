package mock;

import java.util.ArrayList;
import app.goal.Goal;
import app.interfaces.IGoal;
import app.technology.Unite;

public class MockGoal implements IGoal {
	
	public Goal goal;
	
	public MockGoal() {
		goal = new Goal();
	}

	@Override
	public ArrayList<Goal> afficherListeObjectif() {
		// TODO Auto-generated method stub
		ArrayList<Goal> goals = new ArrayList<>();
		goals.add(goal);
		return goals;
	}

	@Override
	public boolean isObjectifExist() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public app.goal.Goal selectObjectif(int id_objectif, app.goal.Goal... ListeObjectifs) {
		return goal;
	}

	@Override
	public boolean checkSaisie() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validerObjectif(app.goal.Goal Objectif) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Goal configurerObjectifUser(int PieceOr, Unite... Unites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createGoalUnite(Unite... Unities) {
		// TODO Auto-generated method stub
		return false;
	}

}
