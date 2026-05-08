package application;

import modeles.*;
import java.util.ArrayList;

public class Application {

    private ArrayList<Personne> employes;

    // constructeur
    public Application() {
        employes = new ArrayList<>();
    }

    // ajout des données de test
    public void initialiserDonnees() {

        employes.add(
                new Ouvrier(
                        "KAMAL",
                        "Youssef",
                        "AB123456",
                        5000,
                        20,
                        75
                )
        );

        employes.add(
                new Ouvrier(
                        "AMRANI",
                        "Said",
                        "AB123457",
                        6000,
                        16,
                        75
                )
        );

        employes.add(
                new Ingenieur(
                        "BENNANI",
                        "Aicha",
                        "AB123458",
                        15000,
                        3000
                )
        );

        employes.add(
                new Ingenieur(
                        "TAZI",
                        "Omar",
                        "AB123459",
                        18000,
                        4000
                )
        );

        employes.add(
                new Stagiaire(
                        "ALAMI",
                        "Salma",
                        "AB123460",
                        2500,
                        "ENSAM"
                )
        );
    }

    // affichage des employes
    public void afficherEmployes() {
        for (Personne personne : employes) {
            personne.role();
            personne.afficher();
        }
    }

    // calcul de la masse salariale
    public void afficherMasseSalariale() {

        double masseSalariale = 0;

        for (Personne personne : employes) {
            if (personne instanceof Employe emp) {
                masseSalariale += emp.calculerSalaire();
            }
        }

        System.out.printf("\n--- Masse salariale totale (employes) : %.2f DH ---\n", masseSalariale);
    }

    public void executer() {

        initialiserDonnees();
        afficherEmployes();
        afficherMasseSalariale();
    }
}