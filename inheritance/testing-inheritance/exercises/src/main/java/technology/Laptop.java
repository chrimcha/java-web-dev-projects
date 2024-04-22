package technology;

public class Laptop extends Computer{

    // 1 additional property
    private Boolean hasCover;

    // constructor
    public Laptop(String aBrand, boolean aHasWebCam, double aStorageSpace, Boolean aHasCover) {
        super(aBrand, aHasWebCam, aStorageSpace);
        this.hasCover = aHasCover;
    }

    public Laptop(String aBrand, Boolean hasCover) {
        super(aBrand);
        this.hasCover = hasCover;
    }

    // 1 additional method
    public void addlaptopCover() {
        hasCover = true;
    }

    // getters and setters
    public Boolean getHasCover() {
        return hasCover;
    }

    public void setHasCover(Boolean aHasCover) {
        this.hasCover = aHasCover;
    }

    // override methods
    @Override
    public String toString() {
        return "ID: " + getId() +
                "\nbrand: "+getBrand() +
                "\nhasWebCam: "+getHasWebCam() +
                "\nstorageSpace: "+getStorageSpace()+"gb"+
                "\nhasCover: " + hasCover;
    }
}
