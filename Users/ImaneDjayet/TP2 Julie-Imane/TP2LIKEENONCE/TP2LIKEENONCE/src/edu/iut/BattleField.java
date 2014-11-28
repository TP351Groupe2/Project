package edu.iut;

import java.util.ArrayList;

public class BattleField{
	protected int x;
	protected int y;
	protected ArrayList<BattleFieldMatrix> plateau;
	/**
	 * 
	 * @param x 
	 * @param y
	 * (x,y) représente la position de la pièce
	 */
	
	

	public BattleField (){
		
		plateau = new ArrayList<BattleFieldMatrix>();
		
	}
	

	
	public void add(BattleFieldMatrix m ) throws ExceptionMatrice{
		if (plateau.isEmpty()){
			plateau.add(m);
		}
		
		else{
			int i = 0;
			boolean compatible = true;
			while ( i < plateau.size() && compatible){
				compatible = testCompatible(m,plateau.get(i));
				i++;
			}
			if(compatible){
				plateau.add(m);
			}
		}
		
	}
	
	public String get(int x,int y) throws ExceptionMatrice{
		String type = null;
		for (BattleFieldMatrix a : plateau){
			if(a.exists(x,y)){
			 type=a.get(x, y).getClass().toString();
			}
		}
		return type;
		
	}
	
	public BattleFieldMatrix getP(int i){
		return plateau.get(i);
		
	}
	
	
	public boolean testCompatible(BattleFieldMatrix m, BattleFieldMatrix n) throws ExceptionMatrice{
		if (m.width()!=n.width() && m.height()!=n.height())	{
			throw new ExceptionMatrice("Taille différente",m,n);
		}
		boolean ok=true;
		for (int i =0; i<m.height();i++){
		
			for (int j = 0; j<m.width();j++){
				if ((BattleFieldPieceWise) m.get(i,j) != null){
				ok = ( (BattleFieldPieceWise) m.get(i,j)).isCompatible((BattleFieldPieceWise) n.get(i,j));}
				if(!ok){
					break;
				}				
			}
			if(!ok){
				break;
			}
		}
		return ok;	
	}


	


	public void setPlateau(ArrayList<BattleFieldMatrix> plateau) {
		this.plateau = plateau;
	}
	

	
}


