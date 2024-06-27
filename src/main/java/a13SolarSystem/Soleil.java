package a13SolarSystem;

public class Soleil extends Astre {
    private static Soleil instance;

    private Soleil() {
        super("Soleil", 1.989e30, 695700); // Masse en kg, Rayon en km
    }

    public static Soleil getInstance() {
        if (instance == null) {
            instance = new Soleil();
        }
        return instance;
    }
}
