package modeles;

public class Employe extends Personne {

    private static int compteur = 1;
    private int matricule;
    private double salaireBase;

    public Employe(){};

    public Employe(String nom, String prenom,
                   String cin, double salaireBase) {

        super(nom, prenom, cin);

        this.matricule = compteur;
        this.salaireBase = salaireBase;

        compteur++;
    }

    // méthode normale (non abstraite)
    public double calculerSalaire() {
        return salaireBase;
    }

    @Override
    public void role() {
        System.out.print("JE SUIS UN EMPLOYE : ");
    }

    // getters
    public int getMatricule() {
        return matricule;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public static int getCompteur() {
        return compteur;
    }

    // setters
    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public static void resetCompteur() {
        compteur = 1;
    }
}