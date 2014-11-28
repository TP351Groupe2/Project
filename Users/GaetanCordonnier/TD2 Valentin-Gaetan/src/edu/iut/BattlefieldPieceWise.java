package edu.iut;

public abstract class BattlefieldPieceWise {
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
	
	public abstract boolean isCompatible(BattlefieldPieceWise with);
	public abstract boolean isDestroyable();
	public abstract String toString();
}
