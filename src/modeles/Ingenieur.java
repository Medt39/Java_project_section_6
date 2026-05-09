package modeles;

public class Ingenieur extends Employe {

    private double primeResponsabilite;

    // constructeur
    public Ingenieur(String nom, String prenom, String cin,
                     double salaireBase,
                     double primeResponsabilite) {

        super(nom, prenom, cin, salaireBase);

        this.primeResponsabilite = primeResponsabilite;
    }

    public Ingenieur() {
        super();
        this.primeResponsabilite = 0.0;
    }

    @Override
    public void role() {
        System.out.print("JE SUIS UN INGENIEUR : ");
    }

    @Override
    public double calculerSalaire() {
        return getSalaireBase() + primeResponsabilite;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.printf(", Salaire: %.2f DH\n",calculerSalaire());
    }

    // getters
    public double getPrimeResponsabilite() {
        return primeResponsabilite;
    }

    // setters
    public void setPrimeResponsabilite(double primeResponsabilite) {
        this.primeResponsabilite = primeResponsabilite;
    }
}