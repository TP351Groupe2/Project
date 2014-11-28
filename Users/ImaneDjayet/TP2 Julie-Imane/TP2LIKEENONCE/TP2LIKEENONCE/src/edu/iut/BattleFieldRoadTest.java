package edu.iut;


import static org.junit.Assert.*;

import org.junit.Test;


	public class BattleFieldRoadTest {

		@Test
		public void testCompatible() {
			//fail("Not yet implemented");
		
		BattleFieldRoad n = new BattleFieldRoad(2,2);
		BattleFieldWater w = new BattleFieldWater(2,1);

			/**
			 * Test qui vérifie que les pieces de types route et les pieces de type eau ne sont pas compatibles
			 *
			 */
		assertTrue("isCompatible",n.isCompatible(w) == false);

		}
	
	
	@Test
	public void testDestructible() {
	BattleFieldRoad n = new BattleFieldRoad(2,2);
	/**
	 * Test qui vérifie que la pice est bien destructible
	 */
	assertTrue("Destructible",n.isDestroyable()==true);
	}
	}