package edu.iut;

public class BattleFieldRoad extends BattleFieldPieceWise{

	public BattleFieldRoad(int p, int q) {
		super(p, q);
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isCompatible(BattleFieldPieceWise piece) {
		// TODO Auto-generated method stub
		/**
		 * @param BattleFieldPieceWise piece
		 * @return boolean
		 * Cette fonction renvoie vrai si la pièce comparée est de type plaine ou route
		 */if (this != null && piece != null){
		
		BattleFieldLandScape piecePlaine = new BattleFieldLandScape(1,1);
		
		return (piece.getClass() == piecePlaine.getClass() || piece.getClass() == this.getClass());
		 }
		 return false;
	}

	@Override
	public boolean isDestroyable() {
		// TODO Auto-generated method stub
		return true;
		/**
		 * La piece de type route est destructible
		 */
	}

}
