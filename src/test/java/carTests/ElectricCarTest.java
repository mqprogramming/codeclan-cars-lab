package carTests;

import cars.ElectricCar;
import components.CarEngine;
import components.Navigation;
import components.Stereo;
import components.Tyres;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ElectricCarTest {

    CarEngine engine = new CarEngine("electric", 12, 10.5);
    Tyres tyres = new Tyres();
    Stereo stereo = new Stereo();
    Navigation navigation = new Navigation();

    ElectricCar electricCar = new ElectricCar(engine, tyres, stereo, navigation, 5000.50, "blue", 3);

    @Before
    public void before() {

    }

    @Test
    public void canGetProperties() {

        CarEngine engine = electricCar.getEngine();
        assertNotNull(engine);
        Tyres tyres = electricCar.getTyres();
        assertNotNull(tyres);
        Stereo stereo = electricCar.getStereo();
        assertNotNull(stereo);
        Navigation navigation = electricCar.getNavigation();
        assertNotNull(navigation);

        assertEquals(5000.50, electricCar.getPrice(), 0.01);
        assertEquals("blue", electricCar.getColour());
        assertEquals(3, electricCar.getAge());

    }

}
