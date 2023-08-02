package hometask8.vehicles;

public interface WaterTransport {
    void move();
}

class Boat implements WaterTransport {
    @Override
    public void move() {
        System.out.println("Boat is sailing on water.");
    }
}

class Ship implements WaterTransport {
    @Override
    public void move() {
        System.out.println("Ship is sailing on water with a large capacity.");
    }
}

class Barge implements WaterTransport {
    @Override
    public void move() {
        System.out.println("Barge is used for cargo transportation on water.");
    }
}
