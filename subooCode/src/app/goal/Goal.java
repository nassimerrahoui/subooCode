/**
 * 
 */
package app.goal;

import java.util.ArrayList;
import app.buildorder.BuildOrder;
import app.technology.Unite;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Grey
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Goal {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int nb_po;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int nb_n;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ArrayList<GoalUnite> objectifUnites;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int id;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ArrayList<BuildOrder> buildOrder;
	
	public void setNb_po(int i) {
		this.nb_po = i;
		
	}

	public void setObjectifUnites(ArrayList<GoalUnite> li) {
		this.objectifUnites = li;
		
	}

	public ArrayList<GoalUnite> getGoalUnite() {
		return this.objectifUnites;
	}

	public Object getNb_po() {
		return this.nb_po;
	}

}