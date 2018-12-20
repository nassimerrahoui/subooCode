/**
 * 
 */
package app.goal;

import app.technology.Unite;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Grey
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GoalUnite {
	public GoalUnite(Goal goal, int i, Unite unite2) {
		this.objectif = goal;
		this.unite = unite2;
		this.nb_unite = i;
	}
	public GoalUnite(int i, Unite unite2) {
		this.nb_unite =i;
		this.unite = unite2;
	}
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Goal objectif;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int nb_unite;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Unite unite;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int id;
}