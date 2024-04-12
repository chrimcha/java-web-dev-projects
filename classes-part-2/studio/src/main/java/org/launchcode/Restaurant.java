package org.launchcode;

import java.util.ArrayList;
import java.util.Map;

public class Restaurant {

    public static void main(String[] args) {
        // menu a, menu items
        MenuItem arrozConLeche = new MenuItem("Arroz con Leche",2.00,"This delicious mexican rice pudding is creamy with cinnamon flavor!","Sweets");
        MenuItem tresLechesPastel = new MenuItem("Pastel de Tres Leches",3.50,"A sponge cake that has been steeped in three different kinds od milk: condensed, evaporated, and heavy cream. Served with whipped cream and sliced strawberries.","Sweets");
        MenuItem torta = new MenuItem("Torta",9.99,"Mexican sandwich with grilled chicken, lettuce, mayo, beans, jalepenos, tomato, and fresh avocado. Served with French Fries.","House Specials");
        MenuItem fries = new MenuItem("French Fries",2.00,"Seasoned French Fried","Sides");
        MenuItem flourTortillas = new MenuItem("Flour Tortillas",0.99,"Fresh flour totillas made in house!","Sides");
        MenuItem lunchSpecial1 = new MenuItem("Lunch Special #1",7.99,"One burrito with beans and rice.","Lunch");
        MenuItem lunchSpecial2 = new MenuItem("Lunch Special #1",8.99,"One chile relleno, one taco, beans, and guacamole salad.","Lunch");
        MenuItem mexicanSoda = new MenuItem("Mexican Soda",2.19,"Jarritos Mexican Soda: Mandarina | Pina | Tamarindo | Fresa","Beverages");
        MenuItem juices = new MenuItem("Juices",2.19,"Aguas Frescas: Horchata | Jamaica","Beverages");
        MenuItem tacosPastor = new MenuItem("Tacos Pastor",9.99,"Three tacos with marinated pork, onion, cilantro, house-made tomatillo salsa and lime. Served with rice and beans.","Dinner");
        MenuItem camaronALaDiabla = new MenuItem("Camaron A La Diabla",13.99,"Grilled shrimp with our secret sauce, served with rice, lettuce, guacamole, and pico de gallo.","Dinner");

        //add menu items into Menu Item ArrayList
        ArrayList<MenuItem> openingDayMenuItems = new ArrayList<>();
        openingDayMenuItems.add(arrozConLeche);
        openingDayMenuItems.add(tresLechesPastel);
        openingDayMenuItems.add(torta);
        openingDayMenuItems.add(fries);
        openingDayMenuItems.add(flourTortillas);
        openingDayMenuItems.add(lunchSpecial1);
        openingDayMenuItems.add(lunchSpecial2);
        openingDayMenuItems.add(mexicanSoda);
        openingDayMenuItems.add(juices);
        openingDayMenuItems.add(tacosPastor);
        openingDayMenuItems.add(camaronALaDiabla);

        Menu openingDayMenu = new Menu(openingDayMenuItems);


        MenuItem burger = new MenuItem("Hamburger",8.50,"Hamburger with lettuce, tomato, mustard, onion, and jalapeno. Served with Fries.","Dinner");
        MenuItem bLT = new MenuItem("BLT",5.99,"Classic bacon, lettuce, tomato, and mayo.","Lunch");
        MenuItem bagel = new MenuItem("Bagel",1.99,"Fresh bagels from the market. Served with your choice of butter, jam, or cream cheese.","Breakfast");
        MenuItem coffee = new MenuItem("French Press Coffee",1.99,"Coffee served with sugar and cream","Beverage");

        //add new menu items into Menu Item ArrayList
        ArrayList<MenuItem> weekendMenu1Items = new ArrayList<>();
        weekendMenu1Items.add(burger);
        weekendMenu1Items.add(bLT);
        weekendMenu1Items.add(bagel);
        weekendMenu1Items.add(coffee);

        Menu weekendMenu1 = new Menu(weekendMenu1Items);

        //figure out how to iterate over the Menu obj
//        for (Map.Entry<String, String> meunItem : openingDayMenuItems.entrySet()) {
//            System.out.println(meunItem.getKey() + " (" + meunItem.getValue() + ")");
//        }
    }
}
