package edu.iut;

public class BattleFieldLandScape extends BattleFieldPieceWise {
	
	
	
	
	
	
	public boolean isCompatible(BattleFieldPieceWise with) {
		Class<?> withClass = with.getClass();
		if (withClass.getName().equals("edu.iut.BattleFieldWater")) return false;
		else if (withClass.getName().equals("edu.iut.BattleFieldRoad")) return true;
		else return true;
	}
	
	public boolean isDestroyable() {
		return true;
	}
	
	public String toString() {
		return "Paysage";
	}
}
