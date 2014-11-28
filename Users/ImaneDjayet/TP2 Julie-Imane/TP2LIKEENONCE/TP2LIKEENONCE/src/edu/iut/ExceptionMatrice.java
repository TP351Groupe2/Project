package edu.iut;

public class ExceptionMatrice extends Exception {
	String message;
	
	ExceptionMatrice(String s,int i, int j){
		this.message = s;
		System.out.println(toString(s,i,j));
	}
		public String toString(String s ,int i, int j){
			String m ="Une exception s'est déclenchée car : la case "+i+";"+j+" est une "+s+".";
			return m ;
		}
		
		
		ExceptionMatrice(String s,BattleFieldMatrix m , BattleFieldMatrix n){
			this.message = s;
			System.out.println(toStringM(s,m,n));
		}
		
		public String toStringM(String s ,BattleFieldMatrix m , BattleFieldMatrix n){
			String sm ="Une exception s'est déclenchée car : la BattleFieldMatrix"+m+"et la BattleFieldMatrix"+n+"n'ont pas "+s+"";
			return sm ;
		}
		
}
