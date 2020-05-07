import behaviours.IDrive;

import cars.ElectricCar;
import components.CarEngine;
import components.Navigation;
import components.Stereo;
import components.Tyres;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    CarEngine engine;
    Tyres tyres;
    Stereo stereo;
    Navigation navigation;

    IDrive electricCar;

    @Before
    public void before() {

        dealership = new Dealership();

        engine = new CarEngine("electric", 12, 10.5);
        tyres = new Tyres();
        stereo = new Stereo();
        navigation = new Navigation();

        electricCar = new ElectricCar(engine, tyres, stereo, navigation, 5000.50, "blue", 3);
    }

    @Test
    public void tillIsEmpty() {
        assertEquals(0, dealership.getTill(), 0.01);
    }

    @Test
    public void canAddToTill() {
        dealership.addToTill(5000);
        assertEquals(5000, dealership.getTill(), 0.01);
    }

    @Test
    public void hasStock() {
        dealership.buy(electricCar);
        assertEquals(1, dealership.getStockCount());
    }

}

