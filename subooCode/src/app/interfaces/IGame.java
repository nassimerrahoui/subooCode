/**
 * 
 */
package app.interfaces;

import app.game.InstanceUnite;
import java.util.ArrayList;
import app.game.Game;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Grey
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IGame {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param InstanceUnite
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean checkDispo(InstanceUnite InstanceUnite);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ArrayList<Game> getGames();
}