package hometask8;

// Абстрактний клас для водяних тварин
abstract class WaterAnimal {
    String name;

    public WaterAnimal(String name) {
        this.name = name;
    }

    abstract void swim();
}

// Конкретні класи для водяних тварин
class Pike extends WaterAnimal {
    public Pike(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println(name + " is swimming.");
    }
}

class Carp extends WaterAnimal {
    public Carp(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println(name + " is swimming.");
    }
}

class Catfish extends WaterAnimal {
    public Catfish(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println(name + " is swimming.");
    }
}

// Абстрактний клас для домашніх тварин
abstract class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    abstract void sound();
}

// Конкретні класи для домашніх тварин
class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says Meow.");
    }
}

class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says Woof.");
    }
}

class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " makes a squeaking sound.");
    }
}

// Інтерфейс для птахів
interface Bird {
    void fly();
}

// Класи для птахів
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

// Інтерфейс для птахів хижаків
interface BirdOfPrey {
    void hunt();
}

// Класи для птахів хижаків
class Eagle implements BirdOfPrey {
    @Override
    public void hunt() {
        System.out.println("Eagle is hunting.");
    }
}

class Stork implements BirdOfPrey {
    @Override
    public void hunt() {
        System.out.println("Stork is looking for food.");
    }
}

class Pigeon implements BirdOfPrey {
    @Override
    public void hunt() {
        System.out.println("Pigeons eat seeds and grains.");
    }
}

// Абстрактний клас для транспортних засобів
abstract class Transport {
    String type;

    public Transport(String type) {
        this.type = type;
    }

    abstract void move();
}

// Конкретні класи для транспортних засобів
class Airplane extends Transport {
    public Airplane(String type) {
        super(type);
    }

    @Override
    void move() {
        System.out.println(type + " is flying.");
    }
}

class Helicopter extends Transport {
    public Helicopter(String type) {
        super(type);
    }

    @Override
    void move() {
        System.out.println(type + " is flying using rotors.");
    }
}

class HotAirBalloon extends Transport {
    public HotAirBalloon(String type) {
        super(type);
    }

    @Override
    void move() {
        System.out.println(type + " is floating using hot air.");
    }
}

// Клас для легкового автомобіля
class Car extends Transport {
    public Car(String type) {
        super(type);
    }

    @Override
    void move() {
        System.out.println(type + " is driving on roads.");
    }
}

// Клас для автобуса
class Bus extends Transport {
    public Bus(String type) {
        super(type);
    }

    @Override
    void move() {
        System.out.println(type + " is transporting passengers.");
    }
}

// Клас для трактора
class Tractor extends Transport {
    public Tractor(String type) {
        super(type);
    }

    @Override
    void move() {
        System.out.println(type + " is used for farming.");
    }
}

// Класи для водних транспортних засобів
class Boat extends Transport {
    public Boat(String type) {
        super(type);
    }

    @Override
    void move() {
        System.out.println(type + " is sailing on water.");
    }
}

class Ship extends Transport {
    public Ship(String type) {
        super(type);
    }

    @Override
    void move() {
        System.out.println(type + " is sailing on water with a large capacity.");
    }
}

class Barge extends Transport {
    public Barge(String type) {
        super(type);
    }

    @Override
    void move() {
        System.out.println(type + " is used for cargo transportation on water.");
    }
}
