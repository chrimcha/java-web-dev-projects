package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        //make copy of original flavor and cone arraylists to print later
        ArrayList<Flavor> flavorsOrig = new ArrayList<>();
        flavorsOrig.addAll(flavors);

        ArrayList<Cone> conesOrig = new ArrayList<>();
        conesOrig.addAll(cones);

        ArrayList<Topping> toppingsOrig = new ArrayList<>();
        toppingsOrig.addAll(toppings);

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparatorF = new FlavorComparator();
        flavors.sort(comparatorF);

        //or could combine them (the declaration and the sort)
//        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        //for print formatting
        String beforeSort = "Before Sort: ";
        String afterSort = "After Sort: \n";
        String format = "%1$-30s %2$-10s \n";
        String separator = "######################################################";

        //iterate over Flavor before and after sort, with printf (to format print)
        System.out.println(separator);
        System.out.printf("%30s","\t Flavors\n");
        System.out.println(separator);
        System.out.printf(format,beforeSort,afterSort);
        for (int i = 0; i < flavors.size(); i++) {
            System.out.printf(format, flavorsOrig.get(i).getName(), flavors.get(i).getName());
        }
        System.out.println(separator);

        System.out.println();
        //iterate over Cone before and after sort, with printf (to format print)
        System.out.println(separator);
        System.out.printf("%28s","\t Cones\n");
        System.out.println(separator);
        System.out.printf(format,beforeSort,afterSort);
        for (int i = 0; i < cones.size(); i++) {
            System.out.printf(format, conesOrig.get(i).getName() + ": $" + conesOrig.get(i).getCost(), cones.get(i).getName() + ": $" + cones.get(i).getCost());
        }
        System.out.println(separator);


        //a Comparator class to sort the 'topping' array in order by the 'name' field.
        toppings.sort(new ToppingComparator());
        System.out.println();

        //iterate over Topping before and after sort, with printf (to format print)
        System.out.println(separator);
        System.out.printf("%31s","\t Toppings\n");
        System.out.println(separator);
        System.out.printf(format,beforeSort,afterSort);
        for (int i = 0; i < toppings.size(); i++) {
            System.out.printf(format, toppingsOrig.get(i).getName(), toppings.get(i).getName());
        }
        System.out.println(separator);

    }
}