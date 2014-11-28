package edu.iut.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iut.BattleField;
import edu.iut.BattleFieldLandScape;
import edu.iut.BattleFieldMatrix;
import edu.iut.BattleFieldRoad;
import edu.iut.BattleFieldWater;
import edu.iut.ExceptionMatrice;

public class BattleFieldTest {

	@Test
	public void testAddGet() throws ExceptionMatrice {
		BattleFieldWater p = new BattleFieldWater(1,2);
		//BattleFieldRoad r = new BattleFieldRoad(3,2);
		//BattleFieldLandScape l = new BattleFieldLandScape(1,3);
		BattleFieldMatrix mat = new BattleFieldMatrix(3,4);
		mat.set(1,2,p);
		BattleField b = new BattleField();
		b.add(mat);
	
	
		assertTrue("get",b.get(1,2).equals(p.getClass().toString()));

		
	}
	
	@Test
	public void TtestComptible() throws ExceptionMatrice {
		BattleFieldWater p = new BattleFieldWater(1,2);
		BattleFieldRoad r = new BattleFieldRoad(1,3);
		BattleFieldMatrix mat = new BattleFieldMatrix(4,4);
		mat.set(1,2,p);
		mat.set(1,3,r);
		
		BattleFieldMatrix mat2 = new BattleFieldMatrix(4,4);
		BattleFieldRoad r2 = new BattleFieldRoad(3,2);
		BattleFieldLandScape l = new BattleFieldLandScape(1,3);
		mat2.set(3,2,r2);
		mat2.set(1,3,l);
		
		BattleField b = new BattleField();
		b.add(mat);
		b.add(mat2);
	
	System.out.println(b.getP(1));
		//assertTrue("testCompatible",b.testCompatible(pl);

		
	}

}
