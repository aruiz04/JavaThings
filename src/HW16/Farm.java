package HW16;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Farm {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private List<AgreeCultural> agreeCultural;

    public void printInfo() {
        System.out.println("Printing Farm Object Information");
        System.out.println(this.toString());
        System.out.println("Cattle MapSet Info");
        for (Map.Entry entry : cattle.entrySet()) {
            System.out.println(String.format("%s - %s", entry.getKey(), entry.getValue()));
        }
        System.out.println("Agreecultural List Info");
        for (AgreeCultural a : agreeCultural) {
            System.out.println(a.toString());
        }
    }

    @Override
    public String toString() {
        return String.format("Farm Name: %s Address %s", getName(), getAddress());
    }
}
