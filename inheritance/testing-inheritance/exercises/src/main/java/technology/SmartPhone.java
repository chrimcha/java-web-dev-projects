package technology;

public class SmartPhone extends Computer{

    // 1 addtional property
    private boolean hasScreenProtector = false;

    // constructor
    public SmartPhone(String aBrand, boolean aHasWebCam, double aStorageSpace) {
        super(aBrand, aHasWebCam, aStorageSpace);
    }

    public SmartPhone(String aBrand, boolean hasScreenProtector) {
        super(aBrand);
        this.hasScreenProtector = hasScreenProtector;
    }

    // 1 additional method
    public void addScreenProtector() {
        hasScreenProtector = true;
    }

    // getters and setters
    public boolean getHasScreenProtector() {
        return hasScreenProtector;
    }

    public void setHasScreenProtector(boolean hasScreenProtector) {
        this.hasScreenProtector = hasScreenProtector;
    }

    // override methods
    @Override
    public String toString() {
        return "ID: " + getId() +
                "\nbrand: " + getBrand() +
                "\nhasWebCam: " + getHasWebCam() +
                "\nstorageSpace: " + getStorageSpace() + "gb"+
                "\nhasScreenProtector: " + hasScreenProtector;
    }
}
