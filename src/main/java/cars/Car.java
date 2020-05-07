package cars;

import behaviours.IDrive;
import components.CarEngine;
import components.Navigation;
import components.Stereo;
import components.Tyres;

public abstract class Car implements IDrive {

    private CarEngine engine;
    private Tyres tyres;
    private Stereo stereo;
    private Navigation navigation;
    private double price;
    private String colour;
    private int age;

    public Car(CarEngine engine, Tyres tyres, Stereo stereo, Navigation navigation, double price, String colour, int age) {
        this.engine = engine;
        this.tyres = tyres;
        this.stereo = stereo;
        this.navigation = navigation;
        this.price = price;
        this.colour = colour;
        this.age = age;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Stereo getStereo() {
        return stereo;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

}
