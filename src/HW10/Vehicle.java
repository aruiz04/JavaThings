package HW10;

public class Vehicle {
    private  String Engine;
    private String  Type;

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Vehicle(String engine, String type) {
        Engine = engine;
        Type = type;
    }
}
