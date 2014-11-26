package edu.iut;

import java.util.*;

import edu.iut.exception.ExceptionMatrice;

/**
 * Cette classe permet de manipuler une matrice creuse à l'aide d'un HashMap (certaines cases peuvent être vide)
 * 
 * @param <BattleFieldPieceWise> Type de donnée stockée dans les cases
 * 
 */
public class BattleFieldMatrix<BattleFieldPieceWise> implements InterfaceMatrice<BattleFieldPieceWise> {
	protected HashMap<Integer, HashMap<Integer, BattleFieldPieceWise>> data;
	int longueur, hauteur;
		
	/**
	 * Créé la matrice
	 * @param l Longueur 
	 * @param h Hauteur
	 */
	public BattleFieldMatrix(int l, int h) {
		data = new HashMap<Integer, HashMap<Integer, BattleFieldPieceWise>>();
		longueur = l;
		hauteur = h;
		
		
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
		
		if (!data.containsKey(y)) return null;
		
		HashMap<Integer, BattleFieldPieceWise> ligne = data.get(y);
		
		if (!ligne.containsKey(x)) return null;
		
		return ligne.get(x);
	}

 	/**
 	 * Vérifie l'existance de la valeur
 	 * @param y Ligne
 	 * @param x Colonne
 	 * @return Vrai/Faux
 	 */
	public  boolean exists(int y, int x) {
		if (data.containsKey(y)) {
			if (data.get(y).containsKey(x)) {
				return true;
			}
			else return false;
		}
		else return false;
		
	}
	
	/**
	 * Ajoute une valeur à une ligne et colonne indiqué.
	 * 
	 * @param y Colonne
	 * @param x Ligne
	 * @param val Valeur
	 */
	public void set(int y, int x, BattleFieldPieceWise val) throws ExceptionMatrice{
		if (y >= hauteur || x >= longueur) throw new ExceptionMatrice("Valeur donnée dépasse la taille de la matrice !!");
		
		if (!(data.containsKey(y))) data.put(y, new HashMap<Integer, BattleFieldPieceWise>());
		
		data.get(y).put(x, val);
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
