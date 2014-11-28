package edu.iut;
import static org.junit.Assert.*;

import org.junit.Test;


public class BattleFieldMatrixTest {

	//Mettre en commentaires pour tester chacun des tests un par un 
	
	@Test
	public void testGetSet() throws ExceptionMatrice {
		//fail("Not yet implemented");
	
	BattleFieldMatrix<Integer> n = new BattleFieldMatrix<Integer>(2,2);
	n.set(1,1,42);
	try {
		/**
		 * Test qui vérifie que les fonctions get et set fonctionnent
		 */
	assertTrue("get",n.get(1,1) == 42);
	} catch (ExceptionMatrice e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Test
	public void testExist() throws ExceptionMatrice {
		BattleFieldMatrix<Integer> v = new BattleFieldMatrix<Integer>(2,2);
		v.set(1,1,42);
		v.exists(1, 1);
		assertTrue("exists",v.exists(1,1)== true);
		/**
		 * Test qui vérifie que la fonction qui prouve qu'une case de la matrice existe fonctionne
		 */

	}
	

@Test
public void testHeight() throws ExceptionMatrice {
	BattleFieldMatrix<Integer> w = new BattleFieldMatrix<Integer>(2,3);;
	assertTrue("height",w.height()== 3);
	/**
	 * Test qui vérifie que la fonction testHeight renvoie bien la hauteur de la matrice
	 */

}

@Test
public void testWidth() throws ExceptionMatrice {
	BattleFieldMatrix<Integer> x = new BattleFieldMatrix<Integer>(2,3);;
	assertTrue("width",x.width()== 2);
	/**
	 * Test qui vérifie que la fonction testWidth renvoie bien la longueur de la matrice
	 */


}



}
