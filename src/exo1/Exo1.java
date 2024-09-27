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
		
		//EXERCICE 3 – CALCUL ARITHMETIQUE
		//Afficher le périmètre d’un cercle dont le rayon est une variable
		
		CirclePerimeter ex3 = new CirclePerimeter();
		ex3.setRayon(4);
		System.out.println("Le périmètre d'un cercle de rayon "+ex3.getRayon()+" est de "+ex3.calculatePerimeter()+" centimètres");
		
	}

}     
