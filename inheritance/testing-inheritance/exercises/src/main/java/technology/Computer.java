package technology;

import java.util.ArrayList;
import java.util.UUID;

public class Computer extends AbstractEntity{

    // 3 properties
    private UUID id;
    private final String brand;
    private boolean hasWebCam = false;
    private double storageSpace;

    private ArrayList<UUID> allItems = new ArrayList<>();

    // constructor
    public Computer(String aBrand, boolean aHasWebCam, double aStorageSpace) {
        this.brand = aBrand;
        this.hasWebCam = aHasWebCam;
        this.storageSpace = aStorageSpace;

        id = UUID.randomUUID();
        allItems.add(id);

    }

    public Computer(String aBrand) {
        this.brand = aBrand;
    }

    // 2 methods
    public void addStorageSpace(double storageAmountToAdd) {
        storageSpace = storageSpace + storageAmountToAdd;
    }

    public void addWebCam() {
        hasWebCam = true;
    }

    // getters and setters
    public String getBrand() {
        return brand;
    }

    public boolean getHasWebCam() {
        return hasWebCam;
    }

    public double getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(double aStorageSpace) {
        this.storageSpace = aStorageSpace;
    }

    public UUID getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    // override method
    @Override
    public String toString() {
        return "ID: " + id +
                "\nbrand: " + brand +
                "\nhasWebCam: " + hasWebCam +
                "\nstorageSpace: " + storageSpace + "gb";
    }

    @Override
    public void printId() {
        System.out.println("This ID is '" + getId() + "'");
    }
}
