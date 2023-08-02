package hometask8.animals;

public interface Swimmable {
    void swim();
}

class Pike implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Pike is swimming.");
    }
}

class Carp implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Carp is swimming.");
    }
}

class Catfish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Catfish is swimming.");
    }
}
