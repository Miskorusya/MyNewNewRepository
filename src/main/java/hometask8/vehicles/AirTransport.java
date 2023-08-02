package hometask8.vehicles;

public interface AirTransport {
    void move();
}

class Airplane implements AirTransport {
    @Override
    public void move() {
        System.out.println("Airplane is flying.");
    }
}

class Helicopter implements AirTransport {
    @Override
    public void move() {
        System.out.println("Helicopter is flying using rotors.");
    }
}

class HotAirBalloon implements AirTransport {
    @Override
    public void move() {
        System.out.println("Hot air balloon is floating using hot air.");
    }
}
