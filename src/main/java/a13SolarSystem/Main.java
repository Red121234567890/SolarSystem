package a13SolarSystem;

public class Main {
    public static void main(String[] args) {
        Soleil soleil = Soleil.getInstance();

        Planete terre = new Terre();
        Planete mars = new Mars();

        terre.orbiterAutour(soleil, 149.6e6); // Distance en km
        mars.orbiterAutour(soleil, 227.9e6); // Distance en km

        Satellite lune = new Lune();
        lune.orbiterAutour(terre, 384400); // Distance en km

        // Printing the results
        System.out.println(soleil.getNom() + " est le centre du système solaire.");
        System.out.println(terre.getNom() + " et " + mars.getNom() + " sont des planètes du système solaire.");
        System.out.println(terre.getNom() + " orbite autour de " + terre.getOrbiteAutour().getNom() + " à une distance de " + terre.getDistance() + " km.");
        System.out.println(mars.getNom() + " orbite autour de " + mars.getOrbiteAutour().getNom() + " à une distance de " + mars.getDistance() + " km.");
        System.out.println(lune.getNom() + " orbite autour de " + lune.getOrbiteAutour().getNom() + " à une distance de " + lune.getDistance() + " km.");
    }
}
