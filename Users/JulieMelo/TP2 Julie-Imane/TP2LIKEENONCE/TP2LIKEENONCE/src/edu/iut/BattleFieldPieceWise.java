package edu.iut;

public abstract class BattleFieldPieceWise {
	
	protected int x;
	protected int y;
	
	
	/**
	 * 
	 * @param x 
	 * @param y
	 * (x,y) représente la position de la pièce
	 */
	
	

	public BattleFieldPieceWise (int p, int q){
		this.x = p;
		this.y = q;
		/**
		 * Créer une pièce 
		 * @param p = position en x
		 * @param q = position en y
		 */
	}
	public BattleFieldPieceWise (){
		this.x = -1;
		this.y = -1;
	}
		/**
		 * Créer une pièce 
		 * avec x =-1
		 * avec y = -1
	
	/**
	 * Les méthodes abstraites
	 * @param piece ( la piece avec qui on compare la piece cible)
	 * @return boolean isCompatible = VRAI si la pièce est compatible avec la pièce cible (piece) 
	 * @return boolean isDestroyable = VRAI si la pièce est  destructible
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
