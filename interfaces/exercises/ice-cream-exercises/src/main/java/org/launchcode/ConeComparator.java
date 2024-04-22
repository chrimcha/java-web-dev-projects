package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        return Double.compare(o1.getCost(), o2.getCost());

        //or (solution from book)
//        if (cone1.getCost() - cone2.getCost() < 0){
//            return -1;
//        } else if (cone1.getCost() - cone2.getCost() > 0) {
//            return 1;
//        } else {
//            return 0;
//        }
    }
}
