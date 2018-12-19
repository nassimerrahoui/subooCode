/**
 * 
 */
package app.interfaces;

import app.technology.Unite;
import app.game.InstanceUnite;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 3703990
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IGame {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param nbPO
	* @param N
	* @param myUnities
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void fournirEtatJeu(Object nbPO, Object N, Unite... myUnities);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param InstanceUnite
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void checkDispo(InstanceUnite InstanceUnite);
}