/**
 * 
 */
package app.goal;

import app.interfaces.IGoal;
import app.interfaces.IGoals;
import app.interfaces.IGoalUnite;
import app.interfaces.IUnities;
import java.util.ArrayList;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author Grey
* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class GestionGoal implements IGoal, IGoals, IGoalUnite {
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
	* @see IGoal#selectObjectif(int id_objectif, IGoals... ListeObjectifs)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public IGoal selectObjectif(int id_objectif, IGoals... ListeObjectifs) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGoal#configurerObjectifUser(int PieceOr, IUnities... Unites)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public IGoal configurerObjectifUser(int PieceOr, IUnities... Unites) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
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
	* @see IGoal#validerObjectif(IGoal Objectif)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean validerObjectif(IGoal Objectif) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGoals#afficherListeObjectif()
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ArrayList<IGoals> afficherListeObjectif() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGoalUnite#createGoalUnite(IUnities... Unities)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean createGoalUnite(IUnities... Unities) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}
}