package hometask8.vehicles;

public interface LandTransport {
    void move();
}

class Car implements LandTransport {
    @Override
    public void move() {
        System.out.println("Car is driving on roads.");
    }
}

class Bus implements LandTransport {
    @Override
    public void move() {
        System.out.println("Bus is transporting passengers.");
    }
}

class Tractor implements LandTransport {
    @Override
    public void move() {
        System.out.println("Tractor is used for farming.");
    }
}
