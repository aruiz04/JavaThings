package Restaurant;

import java.util.Date;

public class EmployeePositions {
    private String employeeId;
    private int positionId;
    private boolean isDefault;
    private Date effectiveDate;
    private double rate;
    private RateType rateType;

    public RateType getRateType() {
        return rateType;
    }

    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public EmployeePositions(String employeeId, int positionId, boolean isDefault, Date effectiveDate, double rate, RateType rateType) {
        this.employeeId = employeeId;
        this.positionId = positionId;
        this.isDefault = isDefault;
        this.effectiveDate = effectiveDate;
        this.rate = rate;
        this.rateType = rateType;
    }
}
