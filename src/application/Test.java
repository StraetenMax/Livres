package application;

import java.util.Scanner;
import  bibliotheque.Livre;

public class Test {
	static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {
		Livre[] livres = new Livre[3];
		//Scanner clavier = null;
		
		for(int i=0; i<livres.length; i++){
		Scanner clavier = new Scanner(System.in);
		//String titre = "";
		System.out.print("Donner le titre du livre n°"+(i+1)+" : ");
		String titre = clavier.nextLine();
		//String auteur = "";
		System.out.print("Donner l'auteur du livre n°"+(i+1)+" : ");
		String auteur = clavier.nextLine();
		//double prix = 00.00; 
		System.out.print("Donner le prix du livre n°"+(i+1)+" : ");
		double prix = clavier.nextDouble();
		livres[i]= new Livre(titre, auteur, prix);
		}
		clavier.close();
		
		for(Livre z : livres)
			System.out.println(z);

		System.out.println("Le nombre de livre est de "+Livre.count);
		
		
	
	}

}
