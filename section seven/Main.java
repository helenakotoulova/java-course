import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] spareParts = new String[] { "Tires", "Keys" }; // slo by zapsat i bez toho new String[], ale takhle je to lepsi. 
        // arrays jsou vlastne taky mutable object. Lze prepisovat jejich hodnoty. 
        // inicializovat array s null hodnotami (misto stringu) jde i takto: new String[4]

        // PRED POUZITIM CONSTRUCTORU:
        // Car lajda = new Car();
        // lajda.color = "red";
        // lajda.make = "Renault";

        //PO POUZITI CONSTRUCTORU:
        Car lajda = new Car("Renault", 1005, 2003, "red", spareParts);
        System.out.println(lajda.getCarMake() + " " + lajda.getCarPrice());

        // pokud takhle zupdatuju ten array a neupravim constructory, tak to bude problem, protoze tahle zmena se dotkne vsech aut, ktere dostavaji spareParts
        spareParts[0] = "Filter";

        lajda.setCarMake("Renault Megane");
        lajda.setCarPrice(10000000);

        System.out.println(lajda.getCarMake() + " " + lajda.getCarPrice());

        Car lajda2 = lajda; // nevytvarim novy objekt, maji stejnou referenci,
        // takze kdyz zmenim pomoci setteru color lajdy, tak se zmeni i u lajdy2.

        // spravne bych mela mit v Car.java constructor, ktery mi umozni kopirovat ty objekty,
        // vytvori novou refenrci, takze pak si je muzu vznikle objekty upravovat separatne.
        Car lajda3 = new Car(lajda);
        lajda3.setCarMake("BMW");

        lajda3.drive();
        ;
        System.out.println(lajda);
        // pred: Car@87aac27
        //po: { make='Renault Megane', price='1.0E7', year='2003', color='red', parts='[Ljava.lang.String;@4dd8dc3'}
        // po 2.: { make='Renault Megane', price='1.0E7', year='2003', color='red', parts='[Tires, Keys]'}

        
        Car[] cars = new Car[] {
                new Car("Renault", 1000, 2000, "black", new String[] { "Tires" }),
                new Car("BMW", 15000, 2020, "red", new String[] {"Filter"}),
        };

        Dealership dealership = new Dealership(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");        
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 - 1).\n");
        int index = scan.nextInt();

        dealership.sell(index);

        scan.close();

        System.out.println(dealership.getCar(1));
        dealership.setCar(0, lajda);
        System.out.println(dealership.getCar(0));
        System.out.println(dealership.getCar(1));
    }

}
