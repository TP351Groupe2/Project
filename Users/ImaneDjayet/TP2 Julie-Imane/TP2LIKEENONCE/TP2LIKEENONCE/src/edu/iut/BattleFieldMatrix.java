package edu.iut;
import java.util.ArrayList;


public class BattleFieldMatrix<BattleFieldPieceWise> implements MatriceCreuseInterface<BattleFieldPieceWise> {
	
	protected ArrayList<ArrayList<BattleFieldPieceWise>>matrice;
	int longueur ;
	int hauteur;

	/**
	 * crée une matrice creuse sous la forme d'une ArrayList multidimensionnelle 
	 * @param longueur :  la longueur 
	 * @param hauteur : la hauteur
	 * 
	 */
	
	public BattleFieldMatrix(int w, int h){
		
		matrice = new ArrayList<ArrayList<BattleFieldPieceWise>>();
		this.longueur = w;
		this.hauteur = h;
		for (int i =0; i<h;i++){
			matrice.add(new ArrayList<BattleFieldPieceWise>());
			for (int j = 0; j<w;j++){
				matrice.get(i).add(null);
			}
		}
		
	}

	

	@Override
	public void set(int numeroLigne, int numeroColonne, BattleFieldPieceWise data) throws ExceptionMatrice {
		// TODO Auto-generated method stub
		if (exists(numeroLigne,numeroColonne)){
			throw new ExceptionMatrice("Case-Inexistante",numeroLigne,numeroColonne);
		}
		 matrice.get(numeroLigne).set(numeroColonne,data);
		
		 
	
	}
	 /** Modifie une valeur dans la matrice
	 * @param numeroLigne ligne
	 * @param numeroColonne colonne
	 * @param data BattleFieldPieceWise
	 * @return valeur
	 * throws ExceptionMatrice

	*/

	@Override
	public BattleFieldPieceWise get(int numeroLigne, int numeroColonne) throws ExceptionMatrice {
		

		//if (!exists(numeroLigne,numeroColonne)){
			//throw new ExceptionMatrice("Case-Inexistante!!!!",numeroLigne,numeroColonne);
		//}
			return matrice.get(numeroLigne).get(numeroColonne);
		
	}
	 /** Récupère une valeur dans la matrice
	 * @param numeroLigne ligne
	 * @param numeroColonne colonne
	 * @return valeur
	 * throws ExceptionMatrice

	*/

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
		/**
		 * Donne la hauteur de la matrice
		 */
	}

	@Override
	public int width() {
		// TODO Auto-generated method stub
		return longueur;
		/**
		 * Donne la longueur de la matrice 
		 */
	}

}
