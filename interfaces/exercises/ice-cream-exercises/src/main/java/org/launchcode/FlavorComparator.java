package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    //Modify FlavorComparator to sort Flavor objects by the number of allergens, from highest to lowest.
//    @Override
//    public int compare(Flavor o1, Flavor o2) {
//        return o1.getName().compareTo(o2.getName());
//    }

    @Override
    public int compare(Flavor o1, Flavor o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
