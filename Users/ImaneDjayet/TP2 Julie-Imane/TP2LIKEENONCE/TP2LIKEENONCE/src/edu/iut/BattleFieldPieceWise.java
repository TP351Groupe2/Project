package edu.iut;

public abstract class BattleFieldPieceWise {
	
	protected int x;
	protected int y;
	
	
	/**
	 * 
	 * @param x 
	 * @param y
	 * (x,y) repr�sente la position de la pi�ce
	 */
	
	

	public BattleFieldPieceWise (int p, int q){
		this.x = p;
		this.y = q;
		/**
		 * Cr�er une pi�ce 
		 * @param p = position en x
		 * @param q = position en y
		 */
	}
	public BattleFieldPieceWise (){
		this.x = -1;
		this.y = -1;
	}
		/**
		 * Cr�er une pi�ce 
		 * avec x =-1
		 * avec y = -1
	
	/**
	 * Les m�thodes abstraites
	 * @param piece ( la piece avec qui on compare la piece cible)
	 * @return boolean isCompatible = VRAI si la pi�ce est compatible avec la pi�ce cible (piece) 
	 * @return boolean isDestroyable = VRAI si la pi�ce est  destructible
	 */
	abstract public boolean isCompatible (BattleFieldPieceWise piece);

	abstract public boolean isDestroyable ();
	
	/**
	 * la fonction get
	 * @return les valeurs des attributs x et y 
	 * 
	 * la fonction set
	 * permet de modifier la valeur des attributs x et y
	 */
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
