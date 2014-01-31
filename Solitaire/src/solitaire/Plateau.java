package solitaire;

public class Plateau {
	
	public Plateau(){
		
	}
	
	public String[][] generate(){							//Génération du plateau. Case vide placée à (5, 5).
		String[][] plateau = new String [10][10];
		for (int i = 0; i< plateau.length; i++){
		
			for (int j = 0; j< plateau.length; j++){
				if (i == 0 && j != 0)
					plateau[i][j] = " C" + j;
				else if (i != 0 && j == 0)
					plateau[i][j] = "L" + i + " ";
				else if (i == 5 && j == 5){
					plateau[i][j] = "( )";
				}
				else
					plateau[i][j] = "(O)";
			}
		}
		return plateau;
	}
	
	public boolean[][] rechercheCasesVides(){
		Plateau plateau = new Plateau();
		String [][] currentPlateau = plateau.generate();
		boolean[][] currentCasesVides = new boolean[10][10];
		for (int i = 1; i< currentPlateau.length; i++){
			for (int j = 1; j< currentPlateau[i].length; j++){
				if (currentPlateau[i][j] == "( )"){
					currentCasesVides[i][j] = true;
				}
				else{
					currentCasesVides[i][j] = false;
				}
			}
		}
		return currentCasesVides;
	}
		
	
	
	public void print(){									//Affichage du plateau.
		String[][] plateau = new String [10][10];
		for (int i = 0; i< plateau.length; i++){
		
			for (int j = 0; j< plateau.length; j++){
				if (i == 0 && j != 0)
					plateau[i][j] = " C" + j;
				else if (i != 0 && j == 0)
					plateau[i][j] = "L" + i + " ";
				else if (i == 5 && j == 5){
					plateau[i][j] = "( )";
				}
				else
					plateau[i][j] = "(O)";
				System.out.print(plateau[i][j]);
			}
		System.out.println();
		}
	}
}