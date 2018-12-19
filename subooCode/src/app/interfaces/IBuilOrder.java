/**
 * 
 */
package app.interfaces;

import app.goal.Goal;

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
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void createAction(Object goalUnite);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Objectif
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void calculerBOopti(Goal Objectif);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Objectif
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void obtenirBOopti(Goal Objectif);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Objectif
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void calculerBOnaif(Goal Objectif);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param Objectif
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void obtenirBOnaif(Goal Objectif);
}