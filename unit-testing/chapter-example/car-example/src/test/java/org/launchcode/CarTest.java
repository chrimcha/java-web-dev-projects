package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //could use with Java version of Rover or other previously done JS projects
    //every test case below the @BeforeEach createCarObjects method will be able to use refer back to the value in this new Car object
    Car test_car;
    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota","Prius",10,50);
    }

    //This empty test is simply asserting an expected value of 10 to equal an actual value of 10, with an accepted .001 variance.
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
//    @Test
//    public void testInitialGasTank() {
//        assertEquals(10, test_car.getGasTankLevel(),.001);
//    }

    //Q1.Write another version of testInitialGasTank() using assertFalse(), comparing the value to 0.
//    @Test
//    public void testInitialGasTank() {
//        //is the Gas Tank Level equal to 0? false
//        assertFalse(test_car.getGasTankLevel() == 0);
//    }

    //Q2.Write another version of testInitialGasTank() using assertTrue().
    @Test
    public void testInitialGasTank() {
        assertTrue(test_car.getGasTankLevel() > 0);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
}