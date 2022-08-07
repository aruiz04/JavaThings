package HW15;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(Map<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public List<InsuranceCompany> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(List<InsuranceCompany> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompany> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.rooms = new HashMap<>();
    }

    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsuranceCompany> acceptedInsurances;

    public void printFields() {
        printHeader("Printing all hospital fields");
        System.out.println("Hospital Name: " + getHospitalName());
        System.out.println("Address: " + getAddress());
        System.out.println("Doctors: " + getDoctors());
        System.out.println("Rooms: " + getRooms());
        System.out.println("Accepted Insurances: " + getAcceptedInsurances());
    }

    private void printHeader(String header) {
        String message = String.format("\n*********** %s ***********", header);
        System.out.println(message);
        int l = message.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= l; i++) {
            sb.append("=");
        }
        System.out.println(sb.toString());

    }

    public void printDoctors() {
        printHeader("Printing Doctors List");
        for (Doctor d : getDoctors()) {
            System.out.println(d);
        }
    }

    public void printRooms() {
        printHeader("Printing Rooms List");
        for (Map.Entry e : getRooms().entrySet() ){
            System.out.println(String.format("%s - %s", e.getKey(), e.getValue()));
        }
    }

}
