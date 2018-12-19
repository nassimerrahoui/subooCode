/**
 * 
 */
package app.interfaces;

import app.goal.Goal;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Grey
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IBoOptimizer {
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
	public void calculerBOopti(Goal Objectif);
}