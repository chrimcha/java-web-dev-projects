public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        System.out.println(garfield);
        System.out.println();

        garfield.eat();

        System.out.println("Is Garfield tired? " + garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println("Spike has a weight of "+spike.getWeight());

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire",12);
        System.out.println();

        System.out.println("The plain cat says, '"+plainCat.noise()+"'");
        System.out.println("The Cheshire cat says, '"+cheshireCat.noise()+"'");
    }
}
