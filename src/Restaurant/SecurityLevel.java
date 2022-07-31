package Restaurant;

public class SecurityLevel {
    private int levelId;
    private String description;

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SecurityLevel(int levelId, String description) {
        this.levelId = levelId;
        this.description = description;
    }
}
