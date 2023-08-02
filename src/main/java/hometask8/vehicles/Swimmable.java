package hometask8.vehicles;

public interface Swimmable {
    void swim();
}

class Ship implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Ship is swimming.");
    }
}

class Boat implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Boat is swimming.");
    }
}

class Barge implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Barge is swimming.");
    }
}
