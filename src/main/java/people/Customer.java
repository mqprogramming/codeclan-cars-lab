package people;

import behaviours.IBuy;
import behaviours.IDrive;

import java.util.ArrayList;

public class Customer implements IBuy {

    private double wallet;
    private ArrayList<IDrive> ownedVehicles;

    public Customer(double wallet) {
        this.wallet = wallet;
        this.ownedVehicles = new ArrayList<IDrive>();
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<IDrive> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void addVehicle(IDrive vehicle) {
        ownedVehicles.add(vehicle);
    }

    public int getNumberOfVehicles() {
        return ownedVehicles.size();
    }

    public void buy(IDrive vehicle, Dealership dealship) {
        addVehicle(vehicle);

    }

}
