package edu.iut;

import java.util.ArrayList;
import java.util.HashMap;

import edu.iut.exception.ExceptionMatrice;


public class Tableau<BattlefieldPieceWise> implements IMatriceCreuse<BattlefieldPieceWise> {
	protected ArrayList<ArrayList<BattlefieldPieceWise>> data;
	int longueur;
	int hauteur;
	/**
	 * 
	 * @param l
	 * @param h
	 */
	public Tableau(int l, int h) {
		data = new ArrayList<ArrayList<BattlefieldPieceWise>>();
		longueur = l;
		hauteur = h;
		
		for (int i = 0; i < h; i++) {
			data.add(new ArrayList<BattlefieldPieceWise>());
			for (int j = 0; j < l; j++) {
				data.get(i).add(null);
			}
		}
	}
	
	/**
	 * affiche un case
	 */
	
	public BattlefieldPieceWise get(int y, int x) throws ExceptionMatrice {
		if (y >= hauteur || x >= longueur) throw new ExceptionMatrice("Valeur donnée dépasse la taille de la matrice !!");

		//ArrayList<T> ligne = data.get(y);
		
		return data.get(y).get(x);
	}
	
	/**
	 * verifie si une case est nul 
	 */
	
	public  boolean exists(int y, int x){
		return !(data.get(y).get(x)== null);
	}
	
	/**
	 * 
	 * @param y
	 * @param x
	 * @param val
	 * @throws ExceptionMatrice
	 */
	
	public void set(int y, int x, BattlefieldPieceWise val) throws ExceptionMatrice{
		if (y >=hauteur || x>=longueur)throw new ExceptionMatrice("Valeur Trop grande dépasse celle de la matrice");
		data.get(y).set(x,(BattlefieldPieceWise) val);
		
	}
	
	/**
	 * retourne la hauteur
	 */
	public int height(){
		
		return hauteur;
	}
	/**
	 * retourne la longueur
	 */
	public int width(){
		
		return longueur;
	}
	
	
}
