package HW15;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //Create a new hospital with name only for now
        Hospital hospital = new Hospital("Kaiser Permananete");

        Garage garage = new Garage();
        //Create and add a new Doctor to the hospital Doctors lists\
        hospital.getDoctors().add(new Doctor("Tunga", "Ulambayar", Position.PEDIATRICIAN));
        hospital.getDoctors().add(new Doctor("Gankhuu", "Ulambayar", Position.GENERAL_MEDICINE));
        hospital.getDoctors().add(new Doctor("Armando", "Ruiz",  Position.GYNECOLOGIST));

        //Create a list of Insurance Companies based on the Enum of Accepted Insurances and add to the hospital
        List<InsuranceCompany> insurances = new ArrayList<>();
        for (InsuranceCompany i: InsuranceCompany.values()) {
            insurances.add(i);
        }

        //Create and add an Address and set it to the hospital address field
        Address address = new Address("1000 Van Ness Ave",  "San Francisco" , "94109", "CA");
        hospital.setAddress(address);
        //Add the insurances created earlier
        hospital.setAcceptedInsurances(insurances);
        //Add Rooms to the hospital
        hospital.getRooms().put(1,"Emergency Room");
        hospital.getRooms().put(2,"Waiting Room");
        hospital.getRooms().put(3, "ICU");

        //Print Fields
        hospital.printFields();
        //Print Doctors
        hospital.printDoctors();
        //Print hospital rooms
        hospital.printRooms();

    }

}
