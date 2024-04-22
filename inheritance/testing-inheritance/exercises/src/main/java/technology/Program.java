package technology;

public class Program {

    public static void main(String[] args) {

        // the Computer Class
        Computer comp1 = new Computer("Microsoft",false,500);

        System.out.println("####################");
        System.out.println("**Computer Default**");
        System.out.println(comp1);
        comp1.addWebCam();
        System.out.println("\n**Add webcam**");
        System.out.println(comp1);
        comp1.addStorageSpace(500);
        System.out.println("\n**Add storage (500gb)**");
        System.out.println(comp1);
        System.out.println("####################\n");

        // the Laptop Class
        Laptop laptop1 = new Laptop("Lenovo",true,1000,false);

        System.out.println("####################");
        System.out.println("**Laptop Default**");
        System.out.println(laptop1);
        laptop1.addlaptopCover();
        System.out.println("\n**Add cover**");
        System.out.println(laptop1);
        laptop1.addStorageSpace(1000);
        System.out.println("\n**Add storage (1000gb)**");
        System.out.println(laptop1);
        System.out.println("####################");


        // the SmartPhone Class
        SmartPhone smartPhone1 = new SmartPhone("Apple",true,50);

        System.out.println("\n####################");
        System.out.println("**SmartPhone Default**");
        System.out.println(smartPhone1);
        smartPhone1.addScreenProtector();
        System.out.println("\n**Add screen protector**");
        System.out.println(smartPhone1);
        smartPhone1.addStorageSpace(125);
        System.out.println("\n**Add storage (125gb)**");
        System.out.println(smartPhone1);
        System.out.println("####################");

    }
}
