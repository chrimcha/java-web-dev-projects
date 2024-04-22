package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InheritanceTest {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = HouseCat("Keyboard Cat",7);

        assertEquals(7,keyboardCat.getWeight(),.001);
    }
}
