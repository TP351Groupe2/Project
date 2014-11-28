package edu.iut;

import static org.junit.Assert.*;

import org.junit.Test;

public class BattleFieldWaterTest {

	@Test
	public void testCompatibleRoute() {
		//fail("Not yet implemented");
	
	BattleFieldRoad n = new BattleFieldRoad(2,2);
	BattleFieldWater w = new BattleFieldWater(2,1);

		/**
		 * Test qui vérifie que les pieces de types route et les pieces de type eau ne sont pas compatibles
		 *
		 */
	assertTrue("isCompatibleRoute",w.isCompatible(n) == false);

	}

	@Test
	public void testCompatiblePlaine() {
		//fail("Not yet implemented");
	
	BattleFieldLandScape l = new BattleFieldLandScape(2,2);
	BattleFieldWater w = new BattleFieldWater(2,1);

		/**
		 * Test qui vérifie que les pieces de types plaine et les pieces de type eau ne sont pas compatibles
		 *
		 */
	assertTrue("isCompatibleRoute",w.isCompatible(l) == false);

	}


@Test
public void testDestructible() {
	
	BattleFieldWater w = new BattleFieldWater(2,2);
/**
 * Test qui vérifie que la piece n'est pas destructible
 */
assertTrue("Destructible",w.isDestroyable()==false);
}
}