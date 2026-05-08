package modeles;

public abstract class Personne {

    // attributs privés
    private String nom;
    private String prenom;
    private String cin;

    // constructeur
    public Personne(String nom, String prenom, String cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
    }

    public Personne(){};

    // methode abstraite
    public abstract void role();

    // affichage des informations
    public void afficher() {
        System.out.print("Nom: " + nom + ", Prenom: " + prenom);
    }

    // getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCin() {
        return cin;
    }

    // setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}