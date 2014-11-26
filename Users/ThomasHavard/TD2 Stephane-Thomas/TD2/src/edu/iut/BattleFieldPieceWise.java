package edu.iut;

public abstract class BattleFieldPieceWise {
	protected int x;
	protected int y;
	
	
	public void setX(int abs) {
		x = abs;
	}
	
	public void setY(int ord) {
		y = ord;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public abstract boolean isCompatible(BattleFieldPieceWise with);
	public abstract boolean isDestroyable();
	public abstract String toString();
}
