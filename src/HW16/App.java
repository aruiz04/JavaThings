package HW16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        //Creating a new Address object for the Farm address;
        Address address =  new Address("1522 Petaluma Blvd N", "Petaluma", "94952", "CA");

        //Creating and generating cattle map object with inventory count
        Map<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.COWS,16);
        cattle.put(Cattle.CHICKEN, 12);
        cattle.put(Cattle.TURKEY, 6);
        cattle.put(Cattle.DOGS, 4);
        cattle.put(Cattle.SHEEP, 25);
        cattle.put(Cattle.PIGS, 18);

        //Creating and generating a list of Agreecultural objects
        System.out.println("Creating and generating a list of Agreecultural objects");
        List<AgreeCultural> agricultural = new ArrayList<>();
        agricultural.add(new AgreeCultural("Soy",4));
        agricultural.add(new AgreeCultural("Corn", 3));
        agricultural.add(new AgreeCultural("Wheat", 12));
        agricultural.add(new AgreeCultural("Peas", 24));
        //Creating a new Farm object with the necessary parameters
        System.out.println("Creating a new Farm object with the necessary parameters");
        Farm farm = new Farm("Marin Sun Farms", address, cattle, agricultural );

        //Printing all farm Info
        System.out.println("Printing all farm Info");
        farm.printInfo();
    }
}
