package edu.iut;

import edu.iut.exception.ExceptionMatrice;

public interface InterfaceMatrice<BattleFieldPieceWise> {
	public BattleFieldPieceWise get(int y, int x) throws ExceptionMatrice;
	public boolean exists(int y, int x);
	public void set(int y, int x, BattleFieldPieceWise val) throws ExceptionMatrice;
	public int width();
	public int height();
}
