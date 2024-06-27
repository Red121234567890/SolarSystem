package a13SolarSystem;

public class Satellite extends Astre implements IOrbitable {
    private double distance;
    private Astre orbiteAutour;

    public Satellite(String nom, double masse, double rayon) {
        super(nom, masse, rayon);
    }

    @Override
    public void orbiterAutour(Astre astre, double distance) {
        this.orbiteAutour = astre;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public Astre getOrbiteAutour() {
        return orbiteAutour;
    }
}
