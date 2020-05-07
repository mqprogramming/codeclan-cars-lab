import behaviours.IBuy;
import behaviours.IDrive;

import java.util.ArrayList;

public class Dealership implements IBuy {

    private double till;
    private ArrayList<IDrive> stock;

    public Dealership() {
        this.till = 0;
        this.stock = new ArrayList<IDrive>();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<IDrive> getStock() {
        return stock;
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addToTill(double amount) {
        this.till += amount;
    }

    public void buy(IDrive vehicle) {
        stock.add(vehicle);
    }
}