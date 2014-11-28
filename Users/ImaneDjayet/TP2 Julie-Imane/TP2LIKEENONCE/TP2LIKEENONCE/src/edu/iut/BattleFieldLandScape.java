package edu.iut;

public class BattleFieldLandScape extends BattleFieldPieceWise {

	public BattleFieldLandScape(int p, int q) {
		super(p, q);
	
		// TODO Auto-generated constructor stub
		/**
		 * Créer une pièce de type "plaine"
		 * @param p = position en x
		 * @param q = position en y
		 */
	}

	@Override
	public boolean isCompatible(BattleFieldPieceWise piece) {
		// TODO Auto-generated method stub
		BattleFieldRoad pieceRoute = new BattleFieldRoad(1,1);
		return(piece.getClass() == this.getClass() || piece.getClass() == pieceRoute.getClass());
	
		/**
		 * @param piece 
		 * La piece de type plaine est compatible avec les pièces de type route et plaine 
		 * Donc on renvoie vrai si la piece comparée (piece) est du même type ou du type route
		 */
	}

	@Override
	public boolean isDestroyable() {
		// TODO Auto-generated method stub
		return true;
		/**
		 * La piece de type "plaine" est destructible
		 */
	}

}
