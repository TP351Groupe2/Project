package edu.iut;

public class BattleFieldWater extends BattlefieldPieceWise {

	public boolean isCompatible(BattlefieldPieceWise with) {
		Class<?> withClass = with.getClass();
		if (withClass.getName().equals("edu.iut.BattleFieldRoad")) return false;
		else if (withClass.getName().equals("edu.iut.BattleFieldLandScape")) return false;
		else return true;
	}
	
	public boolean isDestroyable() {
		return false;
	}
	
	public String toString() {
		return "Eau";
	}
}
