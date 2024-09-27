package exo1;

import java.util.Scanner;

public class Exo1 {
	static boolean continueRun = true;
	public static void main(String[] args) {
		
		
		while(continueRun) {
			menu();
		}
	}
	public static void menu(){
		System.out.println("EXERCICE 1 – AFFICHAGE D’UNE CHAINE");
		System.out.println("EXERCICE 2 – UTILSIATION DE VARIABLES");
		System.out.println("EXERCICE 3 – CALCUL ARITHMETIQUE");
		System.out.println("EXERCICE 4 – SAISIE DE VALEUR");
		System.out.println("EXERCICE 5 – TEST SIMPLE");
		System.out.println("EXERCICE 6 – TEST SIMPLE");
		System.out.println("EXERCICE 7 – TEST AVANCE");
		System.out.println("EXERCICE 8 – TEST AVANCE");
		
		
		Scanner inputChoice = new Scanner(System.in);
		System.out.println("Selectionner le numero de l'exercice : ");
		
		int choice = inputChoice.nextInt();
		switch (choice) {
		case 1: {
			exercice1();
			break;
		}
		case 2: {
			exercice2();
			break;
		}
		case 3: {
			exercice3();
			break;
		}
		case 4: {
			exercice4();
			break;
		}
		case 5: {
			exercice5();
			break;
		}
		case 6: {
			exercice6();
			break;
		}
		case 7: {
			exercice7();
			break;
		}
		case 8: {
			exercice8();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		Scanner inputContinue= new Scanner(System.in);
		System.out.println("Stopper le programme y/n");
		char continueProgram = inputContinue.next().charAt(0);
		if(continueProgram == 'y') {
			continueRun=(false);
		}
		}
	
	public static void exercice1() {
		//EXERCICE 1 – AFFICHAGE D’UNE CHAINE
		//Afficher le texte Hello World dans la console de sortie
		
		ShowString ex1 = new ShowString();
		System.out.println(ex1.getHelloWorld());
	}
	
	public static void exercice2() {
		// EXERCICE 2 – UTILSIATION DE VARIABLES
		// Reprendre l’exercice n°1 en utilisant une variable
				
		ShowString ex2 = new ShowString();
		ex2.setHelloWorld("Goodbye, World!");
		System.out.println(ex2.getHelloWorld());		
	}
	
	public static void exercice3() {
		//EXERCICE 3 – CALCUL ARITHMETIQUE
		//Afficher le périmètre d’un cercle dont le rayon est une variable
		
		CirclePerimeter ex3 = new CirclePerimeter();
		ex3.setRayon(4);
		System.out.println("Le périmètre d'un cercle de rayon "+ex3.getRayon()+" est de "+ex3.calculatePerimeter()+" centimètres");
	}
	
	public static void exercice4() {
		//EXERCICE 4 – SAISIE DE VALEUR
		//Afficher le périmètre d’un cercle dont le rayon est demandé à l’utilisateur
		
		CirclePerimeter ex4 = new CirclePerimeter();
	
		Scanner inputRayon = new Scanner(System.in);
		System.out.println("Indiquez le rayon : ");
	}
	
	public static void exercice5() {
		//EXERCICE 5 – TEST SIMPLE
		//A partir d’une valeur saisie, vérifier si l’utilisateur est majeur ou mineur
		
		AgeTest ex5 = new AgeTest();
		
		Scanner inputAge = new Scanner(System.in);
		System.out.println("Indiquez votre age : ");
		
		int age = inputAge.nextInt();
		ex5.setAge(age);
		System.out.println("Vous etes : "+ex5.majorityTest());
	}
	
	public static void exercice6() {
		//EXERCICE 6 – TEST SIMPLE
		//A partir d’une valeur saisie, indiquer si le nombre saisi est pair ou impair
		
		EvenTest ex6 = new EvenTest();
		
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Entrez un nombre");
		
		int num = inputNum.nextInt();
		ex6.setNumToTest(num);
		System.out.println("Le nombre "+num+" est : "+ex6.evenOrOdd());
	}
	
	public static void exercice7() {
		//EXERCICE 7 – TEST AVANCE
		//Vérifier si une année est bissextile.
		//Pour rappel, une année bissextile est une année multiple de 4, mais pas multiple de 100 ou alors multiple de
		//400.
		
		LeapYear ex7 = new LeapYear();
		
		Scanner inputYear = new Scanner(System.in);
		System.out.println("Entrez une année");
		
		int year = inputYear.nextInt();
		ex7.setYear(year);
		System.out.println("L'année "+year+" "+ex7.LeapYear());		
	}
	public static void exercice8() {
		// EXERCICE 8 BIS – TEST AVANCE
		// Reprendre l’exercice précédent et modifier pour prendre en entrée une chaîne de caractères
		
		DaysInMonth ex8b = new DaysInMonth();
		
		Scanner inputMonth = new Scanner(System.in);
		System.out.println("Entrez un mois");
		
		String month = inputMonth.next();
		ex8b.setMonth(month);
		System.out.println("Le mois de "+month+" possède "+ex8b.getDays()+" jours");
		
		
	}
}     
