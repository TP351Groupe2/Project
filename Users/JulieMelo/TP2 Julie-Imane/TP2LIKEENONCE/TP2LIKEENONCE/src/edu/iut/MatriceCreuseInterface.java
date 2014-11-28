package edu.iut;

public interface MatriceCreuseInterface<BattleFieldPieceWise>  {
	

	public void set(int numeroLigne,int numeroColonne,BattleFieldPieceWise data) throws ExceptionMatrice;
	
	public BattleFieldPieceWise get(int numeroLigne,int numeroColonne)throws ExceptionMatrice;
	
	public boolean exists(int numeroLigne,int numeroColonne);
	
	public int height();
	
	public int width();
}
