package edu.iut;

public class BattleFieldWater extends BattleFieldPieceWise {

	public BattleFieldWater(int p, int q) {
		super(p, q);
	// TODO Auto-generated constructor stub
		/**
		 * Cr�er une pi�ce de type "eau"
		 * @param p = position en x
		 * @param q = position en y
		 */
	}

	@Override
	public boolean isCompatible(BattleFieldPieceWise piece) {
		// TODO Auto-generated method stub
		return(piece.getClass() == this.getClass());
		/**
		 * La pi�ce eau n'est pas compatible avec le pi�ces de type "route" et "plaine" 
		 * C'est pourquoi elle ne renverra Vrai que lorsque le type de la pi�ce compar� sera le m�me que le sien ( soit type "eau")
		 */
		
	
	}

	@Override
	public boolean isDestroyable() {
		// TODO Auto-generated method stub
		return false;
		/**
		 * La pi�ce de type "eau" n'est pas destructible donc on retourne FAUX
		 */
	}

}
