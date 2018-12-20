package test;

import org.junit.Test;

import app.buildorder.BuildOrder;
import app.buildorder.GestionBuildOrder;
import mock.MockGoal;
//import mock.MockTechnology;

public class TestCalculerBONaif{
	
	@Test
	public void testCalculerBONaif(){
		MockGoal mockGoal = new MockGoal();
		//MockTechnology mockTech = new MockTechnology();
		
		GestionBuildOrder gestBO = new GestionBuildOrder();
		
		BuildOrder bo = gestBO.calculerBOnaif(mockGoal.goal);
		//verification du bo obtenu
		
		org.junit.Assert.assertNotNull(bo);
	}
}
