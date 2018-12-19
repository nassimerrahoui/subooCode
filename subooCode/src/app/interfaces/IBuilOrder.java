/**
 * 
 */
package app.interfaces;

import app.buildorder.Action;
import app.goal.Goal;
import app.buildorder.BuildOrder;
import app.buildorder.Delai;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 3703990
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IBuilOrder {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param goalUnite
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Action createAction(Object goalUnite);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Objectif
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public BuildOrder calculerBOopti(Goal Objectif);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Objectif
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public BuildOrder obtenirBOopti(Goal Objectif);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param goal
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public BuildOrder calculerBOnaif(Goal goal);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Objectif
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public BuildOrder obtenirBOnaif(Goal Objectif);
}