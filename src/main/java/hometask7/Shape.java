package hometask7;

// Базовий клас Shape
public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактний метод для обчислення площі фігури
    public abstract double calculateArea();

    // Абстрактний метод для обчислення периметра фігури
    public abstract double calculatePerimeter();
}

