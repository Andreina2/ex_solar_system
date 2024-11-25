package dev.andreina.ex_solar_system;

import dev.andreina.ex_solar_system.model.SolarSystem;

/**
 * Hello world!
 */
public final class AppSolarSystem {
    private AppSolarSystem() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        SolarSystem solarSystem1= new SolarSystem("Mars", 50, 850, 78, 200, 80,
        SolarSystem.TypeOfPlanet.GASEOSO, false, 5, 8);
        System.out.println(solarSystem1.giveData());

        SolarSystem solarSystem2= new SolarSystem("Earth", 50, 850, 78, 200, 80,
        SolarSystem.TypeOfPlanet.TERRESTRE, true,4,8);
        System.out.println(solarSystem2.giveData());
    }
}
