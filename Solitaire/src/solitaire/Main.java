package solitaire;


public class Main {		
	public static void main(String[] args) {
		Plateau plateau = new Plateau();
		plateau.print(); //On affiche le plateau au joueur.
		Console console = new Console();
		boolean validation = true;
		while (validation){
			console.saisie();
			validation = console.verification();
		}
		System.out.println("lol");
	}
}