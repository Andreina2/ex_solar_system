package dev.andreina.ex_solar_system.model;

// atributos
public class SolarSystem {
    private String name = null;
    private int numberOfSatellites= 0;
    private double massInKg= 0;
    private double volumeInCubicKm= 0;
    private int diameterInKm= 0;
    private int avgDistanceToSunInMillionsOfKm= 0;
    private int orbitalPeriod;
    private int rotationPeriod;


    public enum TypeOfPlanet{
        GASEOSO, TERRESTRE, ENANO
    }

    private TypeOfPlanet tyOfPlanet;

    private boolean observableToSimpleView= false;

// constructor
    public SolarSystem(String name, int numberOfSatellites, double massInKg, double volumeInCubicKm, int diameterInKm,
    int avgDistanceToSunInMillionsOfKm, TypeOfPlanet tyOfPlanet, boolean observableToSimpleView, int orbitalPeriod, int rotationPeriod) {
        
    this.name = name;
    this.numberOfSatellites = numberOfSatellites;
    this.massInKg = massInKg;
    this.volumeInCubicKm = volumeInCubicKm;
    this.diameterInKm = diameterInKm;
    this.avgDistanceToSunInMillionsOfKm = avgDistanceToSunInMillionsOfKm;
    this.tyOfPlanet = tyOfPlanet;
    this.observableToSimpleView = observableToSimpleView;
    this.orbitalPeriod= orbitalPeriod;
    this.rotationPeriod= rotationPeriod;
}

    // 1 metodo obtener atributos de un planeta
    public String giveData() {
        return "Planet: " + name +
                "\nNumber of Satellites: " + numberOfSatellites + // \n salto de linea cada atributo en una nueva linea
                "\nMass: " + massInKg + " kg" +
                "\nVolume: " + volumeInCubicKm + " km³" +
                "\nDiameter: " + diameterInKm + " km" +
                "\nAverage Distance to sun: " + avgDistanceToSunInMillionsOfKm + " millions of kilometers" +
                "\nType of planet: " + tyOfPlanet +
                "\nObservable to simple view: " + observableToSimpleView +
                "\nOrbital Period: " + orbitalPeriod  +  "years" +
                "\nRotation Period: " + rotationPeriod  +  "days";


    }
    
    // 2 metodo Calcular la densidad del planeta, como el cociente entre su masa y su volumen.
    public double calculateDensity() {
        if (volumeInCubicKm > 0) {
            return massInKg / volumeInCubicKm;
        } else {
            return 0;
        }
    }

    // 3 metodo Determinar si un planeta del sistema solar se considera exterior.
    public boolean isOutsidePlanet() {
        double distanceInUA = avgDistanceToSunInMillionsOfKm / 149.597870; // convierte en UA
        return distanceInUA > 3.4;
    


}

}

