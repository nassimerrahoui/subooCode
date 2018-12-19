/**
 * 
 */
package app.interfaces;

import java.util.Set;
import app.goal.Goal;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 3703990
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IGoal {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Goal> afficherListeObjectif();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean isObjectifExist();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Objectif
	* @param ListeObjectifs
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean selectObjectif(Goal Objectif, Object ListeObjectifs);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param PieceOr
	* @param Unites
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Goal configurerObjectifUser(Object PieceOr, Object Unites);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void checkSaisie();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Objectif
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean validerObjectif(Goal Objectif);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Unities
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean createGoalUnite(Object Unities);
}