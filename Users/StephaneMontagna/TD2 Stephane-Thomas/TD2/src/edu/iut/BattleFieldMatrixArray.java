package edu.iut;

import java.util.ArrayList;

import edu.iut.exception.ExceptionMatrice;
/**
 * 
 *  Cette classe permet de manipuler une matrice creuse à l'aide d'ArrayList
 *  
 * @param <BattleFieldPieceWise> Type de donnée generique
 */
public class BattleFieldMatrixArray<BattleFieldPieceWise> implements InterfaceMatrice<BattleFieldPieceWise> {
	protected ArrayList<ArrayList<BattleFieldPieceWise>> data;
	int longueur, hauteur;
	
	/**
	 * Constructeur qui crée des données nulles
	 * 
	 * @param l Longueur
	 * @param h Hauteur
	 */
	public BattleFieldMatrixArray(int l, int h) {
		data = new ArrayList<ArrayList<BattleFieldPieceWise>>();
		longueur = l;
		hauteur = h;
		
		for (int i = 0; i < h; i++) {
			data.add(new ArrayList<BattleFieldPieceWise>());
			for (int j = 0; j < l; j++) {
				data.get(i).add(null);
			}
		}
	}
	/**
	 * Récupère une valeur dans la matrice
	 * 
	 * @param y Ligne
	 * @param x Colonne
	 * @return Valeur
	 * @throw Exception si case n'existe pas
	 * 
	 */
	public BattleFieldPieceWise get(int y, int x) throws ExceptionMatrice {
		if (y >= hauteur || x >= longueur) throw new ExceptionMatrice("Valeur donnée dépasse la taille de la matrice !!");

		//ArrayList<T> ligne = data.get(y);
		
		return data.get(y).get(x);
	}
	
	/**
 	 * Vérifie l'existance de la valeur
 	 * @param y Ligne
 	 * @param x Colonne
 	 * @return Vrai/Faux
 	 */
	public boolean exists(int y, int x) {
		return !(data.get(y).get(x) == null);
	}
	/**
	 * Ajoute une valeur à une ligne et colonne indiqué.
	 * 
	 * @param y Colonne
	 * @param x Ligne
	 * @param val Valeur
	 */
	public void set(int y, int x, BattleFieldPieceWise val) throws ExceptionMatrice {
		if (y >= hauteur || x >= longueur) throw new ExceptionMatrice("Valeur donnée dépasse la taille de la matrice !!");
		
		data.get(y).set(x, val);
	}
	/**
	 * Retourne la longueur de la matrice
	 */
	public int width() {
		return longueur;
	}
	
	/**
	 * Retourne la hauteur de la matrice
	 */
	public int height(){
		return hauteur;
	}
}
