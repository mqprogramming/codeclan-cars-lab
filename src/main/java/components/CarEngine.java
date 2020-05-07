package components;

public class CarEngine {

    private String type;
    private int volume;
    private double horsepower;

    public CarEngine(String type, int volume, double horsepower) {
        this.type = type;
        this.volume = volume;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getHorsepower() {
        return horsepower;
    }

}
