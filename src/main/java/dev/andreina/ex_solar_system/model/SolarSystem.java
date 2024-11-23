package dev.andreina.ex_solar_system.model;

// atributos
public class SolarSystem {
    private String name = null;
    private int numberOfSatellites= 0;
    private double massInKg= 0;
    private double volumeInCubicKm= 0;
    private int diameterInKm= 0;
    private int avgDistanceToSunInMillionsOfKm= 0;


    private enum TypeOfPlanet{
        GASEOSO, TERRESTRE, ENANO
    }

    private TypeOfPlanet tyOfPlanet;

    private boolean observableToSimpleView= false;

// constructor
    public SolarSystem(String name, int numberOfSatellites, double massInKg, double volumeInCubicKm, int diameterInKm,
        int avgDistanceToSunInMillionsOfKm, TypeOfPlanet tyOfPlanet, boolean observableToSimpleView) {
    this.name = name;
    this.numberOfSatellites = numberOfSatellites;
    this.massInKg = massInKg;
    this.volumeInCubicKm = volumeInCubicKm;
    this.diameterInKm = diameterInKm;
    this.avgDistanceToSunInMillionsOfKm = avgDistanceToSunInMillionsOfKm;
    this.tyOfPlanet = tyOfPlanet;
    this.observableToSimpleView = observableToSimpleView;
}

    // 1 metodo obtener atributos de un planeta
    public String giveResults() {
        return "Planet: " + name +
                "\nNumber of Satellites: " + numberOfSatellites +
                "\nMass: " + massInKg + " kg" +
                "\nVolume: " + volumeInCubicKm + " km³" +
                "\nDiameter: " + diameterInKm + " km" +
                "\nAverage Distance to sun: " + avgDistanceToSunInMillionsOfKm + " millions of kilometers" +
                "\nType of planet: " + tyOfPlanet +
                "\nObservable to simple view: " + observableToSimpleView;

    }




}
