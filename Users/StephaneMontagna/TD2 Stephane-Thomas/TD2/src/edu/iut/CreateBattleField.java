package edu.iut;

import edu.iut.exception.ExceptionMatrice;

public class CreateBattleField {
	private BattleFieldMatrix<BattleFieldPieceWise> terrain;
	private BattleFieldMatrixArray<BattleFieldPieceWise> terrainArray;
	private int longueur;
	private int hauteur;
	
	public CreateBattleField() {
		BattleFieldRoad route = new BattleFieldRoad();
		BattleFieldWater eau = new BattleFieldWater();
		BattleFieldLandScape paysage = new BattleFieldLandScape();
		
		longueur = 4;
		hauteur = 3;
		
		terrain = new BattleFieldMatrix<BattleFieldPieceWise>(longueur,hauteur);
		terrainArray = new BattleFieldMatrixArray<BattleFieldPieceWise>(longueur,hauteur);
		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < hauteur;j ++) {
				try {
					terrain.set(j, i, paysage);
					terrainArray.set(j, i, paysage);
				} catch (ExceptionMatrice e) {
					e.printStackTrace();
				}
			}
		}
		
		try {
			terrain.set(0, 0, eau);
			for (int i = 0; i < hauteur; i++ ) {
				if (terrain.get(i, 1).isCompatible(route)) terrain.set(i,1, route); 
			}
			if (terrain.get(hauteur/2, longueur/2+1).isCompatible(eau)) terrain.set(hauteur/2, longueur/2+1, eau);;
			if (terrain.get(hauteur/2, longueur-1).isCompatible(eau)) terrain.set(hauteur/2, longueur-1, eau);;
		} catch (ExceptionMatrice e) {
			e.printStackTrace();
		}
	}
	
	public BattleFieldPieceWise get(int x, int y) throws ExceptionMatrice {
		if (x >= longueur || y >= hauteur) throw new ExceptionMatrice("Valeur incorrecte");
		
		return terrain.get(y, x);
	}
	
	public String toString() {
		String a = "";
		
		for (int i = 0; i < hauteur; i++) {
			a += "\n";
			for (int j = 0; j < longueur;j ++) {
				try {
					a += terrain.get(i, j).toString() + " // ";
				} catch (ExceptionMatrice e) {
					e.printStackTrace();
				}
			}
		}
		
		return a;
	}
}
