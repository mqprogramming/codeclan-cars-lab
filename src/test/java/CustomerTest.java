import behaviours.IDrive;

import cars.ElectricCar;
import components.CarEngine;
import components.Navigation;
import components.Stereo;
import components.Tyres;

import org.junit.Before;
import org.junit.Test;

import people.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    CarEngine engine;
    Tyres tyres;
    Stereo stereo;
    Navigation navigation;

    IDrive electricCar;

    @Before
    public void before() {
        customer = new Customer(9000);

        engine = new CarEngine("electric", 12, 10.5);
        tyres = new Tyres();
        stereo = new Stereo();
        navigation = new Navigation();

        electricCar = new ElectricCar(engine, tyres, stereo, navigation, 5000.50, "blue", 3);
    }

    @Test
    public void hasMoney() {
        assertEquals(9000, customer.getWallet(), 0.01);
    }

    @Test
    public void canHaveVehicles() {
        customer.addVehicle(electricCar);
        assertEquals(1, customer.getNumberOfVehicles());
    }

}
