package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private  SecurityLevel securityLevel;
    private Date dateOfHire;

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public SecurityLevel getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(SecurityLevel securityLevel) {
        this.securityLevel = securityLevel;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(Date dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }

    public void setPositions(ArrayList<Position> positions) {
        this.positions = positions;
    }

    private boolean  isActive;
    private String  memo;
    private ArrayList<Position> positions;

    public  Employee(){
        positions = new ArrayList<Position>();
    }
}
