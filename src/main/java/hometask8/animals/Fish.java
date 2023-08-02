package hometask8.animals;


public interface Bird {
    void fly();
}

class Penguin implements Bird {
    @Override
    public void fly() {
        System.out.println("Penguins cannot fly, they swim.");
    }
}

class Kiwi implements Bird {
    @Override
    public void fly() {
        System.out.println("Kiwi birds are flightless.");
    }
}

class Ostrich implements Bird {
    @Override
    public void fly() {
        System.out.println("Ostriches cannot fly, they run.");
    }
}

class Duck implements Bird {
    @Override
    public void fly() {
        System.out.println("Ducks can fly.");
    }
}
