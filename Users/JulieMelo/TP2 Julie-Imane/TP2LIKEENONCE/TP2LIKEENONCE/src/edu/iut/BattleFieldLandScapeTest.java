package edu.iut;

import static org.junit.Assert.*;

import org.junit.Test;

public class BattleFieldLandScapeTest {

	@Test
	public void testCompatibleEau() {
		//fail("Not yet implemented");
	
	BattleFieldLandScape n = new BattleFieldLandScape(2,2);
	BattleFieldWater w = new BattleFieldWater(2,1);

		/**
		 * Test qui vérifie que les pieces de types plaine et les pieces de type eau ne sont pas compatibles
		 *
		 */
	assertTrue("isCompatibleRoute",n.isCompatible(w) == false);

	}

	@Test
	public void testCompatibleRoute() {
		//fail("Not yet implemented");
	
	BattleFieldLandScape l = new BattleFieldLandScape(2,2);
	BattleFieldRoad r = new BattleFieldRoad(2,1);

		/**
		 * Test qui vérifie que les pieces de types plaine et les pieces de type route  sont  compatibles
		 *
		 */
	assertTrue("isCompatibleRoute",l.isCompatible(r) == true);

	}


@Test
public void testDestructible() {
	
	BattleFieldLandScape ls = new BattleFieldLandScape(2,2);
/**
 * Test qui vérifie que la piece n'est pas destructible
 */
assertTrue("Destructible",ls.isDestroyable()==true);
}
}