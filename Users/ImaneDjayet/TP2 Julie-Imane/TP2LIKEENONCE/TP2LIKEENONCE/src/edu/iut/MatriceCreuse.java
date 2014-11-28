package edu.iut;


//package edu.iut;

import java.util.*;

public class MatriceCreuse<GenericData> implements MatriceCreuseInterface<GenericData>{
	protected  HashMap<Integer,HashMap<Integer,GenericData>> matrice;
	
		int longueur ;
		int hauteur;
	
		public MatriceCreuse(int w, int h){
			

			matrice = new HashMap<Integer,HashMap<Integer,GenericData>>();
			this.longueur = w;
			this.hauteur = h;
			
		for (int i = 1; i<=h;i++){
		{
			matrice.put(i, new HashMap<Integer,GenericData>());
			}
		
			for(int j=1;j<=w;j++){
				
				matrice.get(i).put(j,null);
			}
		}
		
		}

	
		/**
		 * Récupère une valeur dans la matrice
		 * @param y ligne
		 * @param x colonne
		 * @return valeur
		 * throws Runtime
		 * @throws ExceptionMatrice 
		 */
			
	
	
	@Override
	public void set(int numeroLigne, int numeroColonne, GenericData data) throws ExceptionMatrice {
		// TODO Auto-generated method stub
		if (exists(numeroLigne,numeroColonne)){
			throw new ExceptionMatrice("Case Existante",numeroLigne,numeroColonne);
		}
		   matrice.get(numeroLigne).put(numeroColonne,data);
	}
	@Override
	public GenericData get(int numeroLigne, int numeroColonne) throws ExceptionMatrice {
		// TODO Auto-generated method stub

		if (!exists(numeroLigne,numeroColonne)){
			throw new ExceptionMatrice("Case Inexistante",numeroLigne,numeroColonne);
		}
			return matrice.get(numeroLigne).get(numeroColonne);
	}
	@Override
	public boolean exists(int numeroLigne, int numeroColonne) {
		// TODO Auto-generated method stub
		return (matrice.get(numeroLigne).get(numeroColonne) != null);
		
		 /** Vérifie que la valeur existe dans la matrice 
		 * @param numeroLigne ligne
		 * @param numeroColonne colonne
		 * @return booleen
	
		*/
	}
	@Override
	public int height() {
		// TODO Auto-generated method stub
		return hauteur;
	}
	@Override
	public int width() {
		// TODO Auto-generated method stub
		return longueur;
	}
}
