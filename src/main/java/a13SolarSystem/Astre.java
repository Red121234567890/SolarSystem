package a13SolarSystem;

public abstract class Astre {
    private String nom;
    private double masse;
    private double rayon;

    public Astre(String nom, double masse, double rayon) {
        this.nom = nom;
        this.masse = masse;
        this.rayon = rayon;
    }

    public String getNom() {
        return nom;
    }

    public double getMasse() {
        return masse;
    }

    public double getRayon() {
        return rayon;
    }
}
