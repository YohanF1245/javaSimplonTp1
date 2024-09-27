package exo1;

public class Exo1 {

	public static void main(String[] args) {
		//EXERCICE 1 – AFFICHAGE D’UNE CHAINE
		//Afficher le texte Hello World dans la console de sortie
		
		ShowString ex1 = new ShowString();
		System.out.println(ex1.getHelloWorld());
		
		// EXERCICE 2 – UTILSIATION DE VARIABLES
		// Reprendre l’exercice n°1 en utilisant une variable
		
		ShowString ex2 = new ShowString();
		ex2.setHelloWorld("Goodbye, World!");
		System.out.println(ex2.getHelloWorld());
		
	}

}     
