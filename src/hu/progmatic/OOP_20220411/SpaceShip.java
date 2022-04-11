package hu.progmatic.OOP_20220411;

public class SpaceShip {
    public String id;
    public String type;
    public boolean isFreight;
    public int speed;

    public SpaceShip() {

    }

    public SpaceShip(String id, String type, boolean isFreight, int speed) {
        this.id = id;
        this.type = type;
        this.isFreight = isFreight;
        this.speed = speed;
    }
}
