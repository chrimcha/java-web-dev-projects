package technology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TechnologyTest {

    // 3 Computer Class tests
    @Test
    public void defaultComputerWebCamValueSet() {
        Computer computer1 = new Computer("Microsoft");
        assertFalse(computer1.getHasWebCam());
    }

    @Test
    public void addWebCamMakesValueTrue() {
        Computer computer1 = new Computer("Microsoft");
        computer1.addWebCam();
        assertTrue(computer1.getHasWebCam());
    }

    @Test
    public void storageSpaceIsUpdateWhenAddingStorage() {
        Computer computer1 = new Computer("Microsoft",true, 500);
        computer1.addStorageSpace(500);
        assertEquals(1000, computer1.getStorageSpace(), .001);
    }

    // 3 Laptop Class tests
    @Test
    public void inheritsDefaultComputerInLaptopSecondConstructor() {
        Laptop laptop1 = new Laptop("Lenovo",false);
        assertFalse(laptop1.getHasWebCam());
    }

    @Test
    public void valueIsUpdatedWhenAddingCover() {
        Laptop laptop1 = new Laptop("Lenovo",false);
        laptop1.addlaptopCover();
        assertTrue(laptop1.getHasCover());
    }

    @Test
    public void valueIsUpdatedWhenAddingStorageToLaptop() {
        Laptop laptop1 = new Laptop("Lenovo", true,500,false);
        laptop1.addStorageSpace(1000);
        assertEquals(1500, laptop1.getStorageSpace(), .001);
    }

    // 3 SmartPhone Class tests
    @Test
    public void inheritsDefaultComputerInSmartPhoneSecondConstructor() {
        SmartPhone smartPhone1 = new SmartPhone("Apple",true);
        assertFalse(smartPhone1.getHasWebCam());
    }

    @Test
    public void valueIsUpdatedWhenAddingScreenProtector() {
        SmartPhone smartPhone1 = new SmartPhone("Apple",false);
        smartPhone1.addScreenProtector();
        assertTrue(smartPhone1.getHasScreenProtector());
    }

    @Test
    public void valueIsUpdatedWhenSettingStorageToLaptop() {
        Laptop laptop1 = new Laptop("Lenovo", true,500,false);
        laptop1.setStorageSpace(3000);
        assertEquals(3000, laptop1.getStorageSpace(), .001);
    }

}
