package edu.iut;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.iut.exception.ExceptionMatrice;

public class test {

	@Test
	public void test() {
		BattleFieldMatrix<Integer> bfm = new BattleFieldMatrix<Integer>(5, 3);
		Tableau<Integer> bfmA = new Tableau<Integer>(5,3);
		
		try {
			//Test du set sur chaque type de bfm
			bfm.set(2, 1, 10);
			bfmA.set(2, 1, 100);
			System.out.println(bfm.get(2, 1));
			System.out.println(bfmA.get(2, 1));
			assertTrue("exists", bfm.get(2, 1) == 10);
			assertTrue("exists", bfmA.get(2, 1) == 100);
		
			CreateBattleField TerrainBattleField = new CreateBattleField();
			
			System.out.println(TerrainBattleField);
			
			assertTrue("test terrain", TerrainBattleField.get(0, 0) instanceof BattleFieldWater);
			
			System.out.println("\nType de Terrain du 1.4 : " +TerrainBattleField.get(0, 3));
			System.out.println("Type de Terrain du 1.1 : " +TerrainBattleField.get(0, 0));
			
			//PAS DE SET pour changer directement le terrain via le test il faut changer les elements dans CreateBattleField
		}
		catch (ExceptionMatrice e) {
			//Ne marche pas rien n'est afficher.
			fail("Erreur");
			
		}		
		
	}

}
