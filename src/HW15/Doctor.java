package HW15;

public class Doctor {

    private String firstName;
    private String lastName;
    private Position position;

    @Override
    public String toString() {
        return String.format("DOCTOR: %s %s, Position: %s", getFirstName(), getLastName(), getPosition());
    }

    public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Doctor(String firstName, String lastName, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
