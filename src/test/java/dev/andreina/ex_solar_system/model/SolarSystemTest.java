package dev.andreina.ex_solar_system.model;
import dev.andreina.ex_solar_system.model.SolarSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolarSystemTest {
    @Test
    void testCalculateDensity() {
        SolarSystem SolarSystem3= new SolarSystem(
            "Mercury", 0, 3.30, 6083.0, 4880, 58,
            SolarSystem.TypeOfPlanet.TERRESTRE, true, 88, 58);
            assertEquals(0.0005495542, SolarSystem3.calculateDensity(), 1);

    }

    @Test
    void testIsOutsidePlanet() {
        SolarSystem SolarSystem4= new SolarSystem(
            "Saturno", 83, 5.68, 8.27, 120536, 1429,
            SolarSystem.TypeOfPlanet.GASEOSO, true, 29, 1);
            assertTrue(SolarSystem4.isOutsidePlanet());


    }
}
