package models;

public class Squad {
    private String maxSize;
    private String squadName;
    private String squadCause;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Squad(String maxSize, String squadName, String squadCause) {
        this.maxSize = maxSize;
        this.squadName = squadName;
        this.squadCause = squadCause;
    }

    public String getMaxSize() {
        return maxSize;
    }

    public String getSquadName() {
        return squadName;
    }

    public String getSquadCause() {
        return squadCause;
    }

    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public void setSquadCause(String squadCause) {
        this.squadCause = squadCause;
    }
}
