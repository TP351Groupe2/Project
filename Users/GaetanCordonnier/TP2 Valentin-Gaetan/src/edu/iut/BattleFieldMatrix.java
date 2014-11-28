	package edu.iut;

	import java.util.*;

import edu.iut.exception.ExceptionMatrice;

	/**
	 * Cette classe permet de manipuler une matrice creuse (certaines cases peuvent �tre vide)
	 * 
	 * @param <T> Type de donn�e stock�e dans les cases
	 * 
	 */
	
	public class BattleFieldMatrix<BattlefieldPieceWise> implements IMatriceCreuse<BattlefieldPieceWise> {
		protected HashMap<Integer, HashMap<Integer, BattlefieldPieceWise>> data;
		int longueur, hauteur;
			
		
		/**
		 * Cr�� la matrice
		 * @param l Longueur 
		 * @param h Hauteur
		 */
		public BattleFieldMatrix(int l, int h) {
			data = (HashMap<Integer, HashMap<Integer, BattlefieldPieceWise>>) new HashMap<Integer, HashMap<Integer, BattlefieldPieceWise>>();
			longueur = l;
			hauteur = h;
		}
		
		/**
		 * R�cup�re une valeur dans la matrice
		 * 
		 * @param y Ligne
		 * @param x Colonne
		 * @return Valeur
		 * @throw Exception si case n'existe pas
		 * 
		 */
		
		public BattlefieldPieceWise get(int y, int x) throws ExceptionMatrice {
			if (y >= hauteur || x >= longueur) throw new ExceptionMatrice("Valeur donn�e d�passe la taille de la matrice !!");
			if (!data.containsKey(y)) return null;
			HashMap<Integer, BattlefieldPieceWise> ligne = data.get(y);
			if (!ligne.containsKey(x)) return null;
			return ligne.get(x);
		}
		
	 	/**
	 	 * V�rifie l'existance de la valeur
	 	 * @param y Ligne
	 	 * @param x Colonne
	 	 * @return Vrai/Faux
	 	 */
		
		public  boolean exists(int y, int x)throws ExceptionMatrice {
			if (data.containsKey(y)) {
				if (data.get(y).containsKey(x)) {
					return true;
				}
				else return false;
			}
			else return false;
		}

		@Override
		public void set(int y, int x, BattlefieldPieceWise val) throws ExceptionMatrice{
			if (y >= hauteur || x >= longueur) throw new ExceptionMatrice("Valeur donn�e d�passe la taille de la matrice !!");
			
			if (!(data.containsKey(y))) data.put(y, new HashMap<Integer, BattlefieldPieceWise>());
			
			data.get(y).put(x, val);
		}
		
		public int height() {
			return hauteur;
			
		}
		
		public int width() {
			return longueur;
			
		}

}


