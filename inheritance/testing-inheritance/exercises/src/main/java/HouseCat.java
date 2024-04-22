public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    // The constructors
    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat (String aName) {
        name = aName;
    }

//    // **Warning**
//    //The above constructor is a bad one, and is included merely to introduce syntax and usage. We would not want to have a constructor for HouseCat that didn’t initialize an essential field such as name.
//    public HouseCat(double aWeight) {
//        super(aWeight);
//    }
//    // **Do not use above code**

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }

    @Override
    public String toString() {
        return "name: '" + name + "'\n" +
                "species: '" + species + '\'' +
                "\nweight: " + getWeight() +
                "\nfamily: '" + getFamily() + '\'';
    }
}