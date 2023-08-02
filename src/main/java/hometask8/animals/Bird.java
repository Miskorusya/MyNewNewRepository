package hometask8.animals;

public interface Fish {
    void swim();
}

class Pike implements Fish {
    @Override
    public void swim() {
        System.out.println("Pike is swimming.");
    }
}

class Carp implements Fish {
    @Override
    public void swim() {
        System.out.println("Carp is swimming.");
    }
}

class Catfish implements Fish {
    @Override
    public void swim() {
        System.out.println("Catfish is swimming.");
    }
}