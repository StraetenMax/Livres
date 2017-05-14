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
	
	//accesseurs et mutateurs
	public int getId(){
		return id;
	}
	public void setId(){
		this.id = ++count;
	}
	public String getTitre(){
		return titre;
	}
	public void setTitre(String titre){
		this.titre = titre;
	}
	public String getAuteur(){
		return auteur;
	}
	public void setAuteur(String auteur){
		this.auteur= auteur;
	}
	public double getPrix(){
		return prix;
	}
	public void setPrix(double prix){
		this.prix = prix;
	}
	// méthodes
	public String toString(){
		return "Le prix du livre "+this.getTitre()+" de l'auteur "+this.getAuteur()+" est de "+this.getPrix();
	}
	
}
