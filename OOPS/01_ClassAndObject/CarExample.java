class OopsCar {
    String model;
    int year;

    void display() {
        System.out.println(model + " - " + year);
    }
}

public class CarExample {
    public static void main(String[] args) {
        OopsCar car = new OopsCar();
        car.model = "Java Sedan";
        car.year = 2026;
        car.display();
    }
}