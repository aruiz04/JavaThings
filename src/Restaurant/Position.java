package Restaurant;

public class Position {
    private int positionId;
    private String description;
    private double rate;

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Position(int positionId, String description, double rate) {
        this.positionId = positionId;
        this.description = description;
        this.rate = rate;
    }
    @Override
    public String toString() {
        String result = String.format("Position Id: %s Description: %s\nRate: %s", getPositionId(), getDescription(), getRate());
        return result;
    }
}
