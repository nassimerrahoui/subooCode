//package mock;
//
//import java.util.ArrayList;
//import app.goal.Goal;
//import app.goal.GoalUnite;
//import app.interfaces.IGoal;
//import app.technology.Unite;
//
//public class MockGoal implements IGoal {
//	
//	public Goal goal;
//	
//	public MockGoal() {
//		goal = new IGoal();
//		goal.setNb_po(300);
//		ArrayList<GoalUnite> li = new ArrayList<GoalUnite>();
//		li.add(new IGoalUnite(goal, 40, new Unite("Ouvrier")));
//		goal.setObjectifUnites(li);
//	}
//
//	@Override
//	public ArrayList<IGoal> afficherListeObjectif() {
//		// TODO Auto-generated method stub
//		ArrayList<IGoal> goals = new ArrayList<>();
//		goals.add(goal);
//		return goals;
//	}
//
//	@Override
//	public boolean isObjectifExist() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public app.goal.Goal selectObjectif(int id_objectif, app.goal.Goal... ListeObjectifs) {
//		return goal;
//	}
//
//	@Override
//	public boolean checkSaisie() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean validerObjectif(app.goal.Goal Objectif) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Goal configurerObjectifUser(int PieceOr, Unite... Unites) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean createGoalUnite(Unite... Unities) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//}

/** TO DO **/
