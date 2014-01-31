package solitaire;

import java.util.Scanner;



public class Console {
	
	public Console(){

	}
	
	public int[] saisie(){

		int colonnePion = 0;
		int lignePion = 0;
		int colonneCaseVide = 0;
		int ligneCaseVide = 0;
		boolean validation = false;
		Scanner sc = new Scanner(System.in);
		
		while (validation != true){
			System.out.println("-------PION A DEPLACER-------");
			System.out.print("-Quelle colonne ? ");
			colonnePion = sc.nextInt();
			System.out.print("-Quelle ligne ? ");
			lignePion = sc.nextInt();
			System.out.println("-------CASE VIDE VISEE-------");
			System.out.print("-Quelle colonne ? ");
			colonneCaseVide = sc.nextInt();
			System.out.print("-Quelle ligne ? ");
			ligneCaseVide = sc.nextInt();
			System.out.println("Vous avez choisi le pion C" + colonnePion + "L" + lignePion + ", et la case vide C" + colonneCaseVide + "L" + ligneCaseVide + ". Est-ce correct ? (oui = 1/ non = 0)");
				int reponse = sc.nextInt();
				if (reponse == 1){
					validation = true;
				}
				
			sc.close();
		}
		return new int[] {colonnePion, lignePion, colonneCaseVide, ligneCaseVide};
	}
	
	
	

	
	public boolean verification(){
		Plateau plateau = new Plateau();
		Console console = new Console();
		int[] resultatSaisies = console.saisie();
		int[] coordonneesPion = new int[2];
		int[] coordonneesCaseVide= new int[2];
		
		coordonneesPion[0] = resultatSaisies[0];
		coordonneesPion[1] = resultatSaisies[1];
		coordonneesCaseVide[0] = resultatSaisies[2];
		coordonneesCaseVide[1] = resultatSaisies[3];
		boolean[][] currentCasesVides = plateau.rechercheCasesVides();
		boolean validation = true;
		
		
		
		for (int i = 0; i< currentCasesVides.length; i++){
			for (int j = 0; j< currentCasesVides.length; j++){
				if (i == coordonneesCaseVide[0] && j == coordonneesCaseVide[1]){
					if ((Math.abs(coordonneesPion[0] - coordonneesCaseVide[0]) == 2) || (Math.abs(coordonneesPion[1] - coordonneesCaseVide[1]) == 2)){
						validation = true;
					}
					else{
						System.out.println("Coordonnées incorrectes.");
						validation = false;
					}
				}
				else{
					validation = false;
				}
				
			}
		}
		return validation;
	}
}

	