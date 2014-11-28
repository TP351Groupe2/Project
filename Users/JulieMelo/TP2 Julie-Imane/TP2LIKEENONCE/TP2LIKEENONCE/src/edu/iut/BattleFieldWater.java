package edu.iut;

public class BattleFieldWater extends BattleFieldPieceWise {

	public BattleFieldWater(int p, int q) {
		super(p, q);
	// TODO Auto-generated constructor stub
		/**
		 * Créer une pièce de type "eau"
		 * @param p = position en x
		 * @param q = position en y
		 */
	}

	@Override
	public boolean isCompatible(BattleFieldPieceWise piece) {
		// TODO Auto-generated method stub
		return(piece.getClass() == this.getClass());
		/**
		 * La pièce eau n'est pas compatible avec le pièces de type "route" et "plaine" 
		 * C'est pourquoi elle ne renverra Vrai que lorsque le type de la pièce comparé sera le même que le sien ( soit type "eau")
		 */
		
	
	}

	@Override
	public boolean isDestroyable() {
		// TODO Auto-generated method stub
		return false;
		/**
		 * La pièce de type "eau" n'est pas destructible donc on retourne FAUX
		 */
	}

}
