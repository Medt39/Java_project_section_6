package modeles;

public class Ouvrier extends Employe {


    private double heuresSupp;
    private double tauxHoraire;


    public Ouvrier(String nom, String prenom,
                   String cin, double salaireBase,
                   double heuresSupp, double tauxHoraire) {

        super(nom, prenom, cin, salaireBase);
        this.heuresSupp = heuresSupp;
        this.tauxHoraire = tauxHoraire;
    }


    @Override
    public void role() {
        System.out.print("JE SUIS UN OUVRIER : ");
    }

    @Override
    public double calculerSalaire() {
        return this.getSalaireBase() + (this.heuresSupp * this.tauxHoraire);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.printf(", Salaire: %.2f DH\n", this.calculerSalaire());
    }


    // getters
    public double getHeuresSupp() {
        return heuresSupp;
    }
    public double getTauxHoraire() {
        return tauxHoraire;
    }

    // setters
    public void setHeuresSupp(double heuresSupp) {
        this.heuresSupp = heuresSupp;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
