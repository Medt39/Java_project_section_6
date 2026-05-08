package modeles;

public class Stagiaire extends Personne {

    // attributs privés
    private double indemnite;
    private String ecole;

    // constructeur
    public Stagiaire(String nom, String prenom, String cin,
                     double indemnite, String ecole) {

        super(nom, prenom, cin);

        this.indemnite = indemnite;
        this.ecole = ecole;
    }

    @Override
    public void role() {
        System.out.print("JE SUIS UN STAGIAIRE : ");
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.printf(", Ecole: %s, Indemnite: %.2f DH\n", this.ecole, this.indemnite);
    }

    // getters
    public double getIndemnite() {
        return indemnite;
    }

    public String getEcole() {
        return ecole;
    }

    // setters
    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public void setIndemnite(double indemnite) {
        this.indemnite = indemnite;
    }

}
