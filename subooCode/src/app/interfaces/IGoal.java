/**
 * 
 */
package app.interfaces;

import java.util.Set;
import app.goal.Goal;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Grey
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
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void isObjectifExist();

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Objectif
	* @param ListeObjectifs
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void selectObjectif(Goal Objectif, Object ListeObjectifs);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param PieceOr
	* @param Unites
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void configurerObjectifUser(Object PieceOr, Object Unites);

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
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void validerObjectif(Goal Objectif);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Unities
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void createGoalUnite(Object Unities);
}