package exo1;

import java.util.Scanner;

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
		
		//EXERCICE 4 – SAISIE DE VALEUR
		//Afficher le périmètre d’un cercle dont le rayon est demandé à l’utilisateur
		
		CirclePerimeter ex4 = new CirclePerimeter();
	
		Scanner inputRayon = new Scanner(System.in);
		System.out.println("Indiquez le rayon : ");
		
		float rayon = inputRayon.nextFloat();
		ex4.setRayon(rayon);
		System.out.println("Le périmètre d'un cercle de rayon "+ex4.getRayon()+" est de "+ex4.calculatePerimeter()+" centimètres");
		
		//EXERCICE 5 – TEST SIMPLE
		//A partir d’une valeur saisie, vérifier si l’utilisateur est majeur ou mineur
		
		AgeTest ex5 = new AgeTest();
		
		Scanner inputAge = new Scanner(System.in);
		System.out.println("Indiquez votre age : ");
		
		int age = inputAge.nextInt();
		ex5.setAge(age);
		System.out.println("Vous etes : "+ex5.majorityTest());
		
	}

}     
