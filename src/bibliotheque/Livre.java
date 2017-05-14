package bibliotheque;

public class Livre {
	//propriétés
	private int id;
	private String titre, auteur;
	private double prix;
	public static int count;
	
	//constructeurs
	public Livre(){
		id = ++count;
		titre = "";
		auteur = "";
		prix = 00.00;
	}
	public Livre(String titre, String auteur, double prix){
		this.id = ++count;
		this.titre = titre;
		this.auteur = auteur;
		this.prix= prix;
	}
	
	//
}
