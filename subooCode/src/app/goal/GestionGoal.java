/**
 * 
 */
package app.goal;

import app.interfaces.IGoal;
import java.util.ArrayList;
import app.technology.Unite;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Grey
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GestionGoal implements IGoal {
	/** 
	* (non-Javadoc)
	* @see IGoal#afficherListeObjectif()
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ArrayList<Goal> afficherListeObjectif() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGoal#isObjectifExist()
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean isObjectifExist() {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGoal#selectObjectif(int id_objectif, Goal... ListeObjectifs)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Goal selectObjectif(int id_objectif, Goal... ListeObjectifs) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGoal#configurerObjectifUser(int PieceOr, Unite... Unites)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Goal configurerObjectifUser(int PieceOr, ArrayList<GoalUnite> Unites) {
		Goal g = new Goal();
		g.setNb_po(PieceOr);
		g.setObjectifUnites(Unites);
		return g;
	}

	/** 
	* (non-Javadoc)
	* @see IGoal#checkSaisie()
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean checkSaisie() {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGoal#validerObjectif(Goal Objectif)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean validerObjectif(Goal Objectif) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGoal#createGoalUnite(Unite... Unities)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean createGoalUnite(Unite... Unities) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	@Override
	public Goal configurerObjectifUser(int PieceOr, Unite... Unites) {
		// TODO Auto-generated method stub
		return null;
	}
}