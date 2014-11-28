package edu.iut.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iut.*;
import edu.iut.exception.ExceptionMatrice;

public class TestBattleFieldMatrix {

	@Test
	public void test() {
		// fail(message) = le test a échoué
		// assertTrue(message, test) ; ex : assertTrue("arith", 1+1==2);
		// assertFalse(message, test) ; ex : assertTrue("arith", 1+1==4845);
		
		BattleFieldMatrix<Integer> bfm = new BattleFieldMatrix<Integer>(5, 3);
		BattleFieldMatrixArray<Integer> bfmA = new BattleFieldMatrixArray<Integer>(5,3);
		
		try {
			bfm.set(2, 1, 154);
			bfmA.set(2, 1, 159);
				
			System.out.println(bfm.get(2, 1));
			System.out.println(bfmA.get(2, 1));
			assertTrue("exists", bfm.get(2, 1) == 154);
			assertTrue("exists", bfmA.get(2, 1) == 159);
		
			CreateBattleField terrain = new CreateBattleField();
			
			System.out.println(terrain);
			
			assertTrue("test terrain", terrain.get(0, 0) instanceof BattleFieldWater);
		}
		catch (ExceptionMatrice e) {
			fail("A lancé une exception et n'aurait pas du");
		}		
		
	}

}
