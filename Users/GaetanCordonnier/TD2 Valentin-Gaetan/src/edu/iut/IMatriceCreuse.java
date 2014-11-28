package edu.iut;

import edu.iut.exception.ExceptionMatrice;

/**
 * 
 * @author valentin.madeira
 *
 *Interface pour les implementations de la matrice
 * @param <T>
 */
public interface IMatriceCreuse<BattlefieldPieceWise> {
	
	public BattlefieldPieceWise get(int y, int x)throws ExceptionMatrice;
	public  boolean exists(int y, int x)throws ExceptionMatrice;
	public void set(int y, int x, BattlefieldPieceWise val)throws ExceptionMatrice;
	public int height();
	public int width();
	
}
