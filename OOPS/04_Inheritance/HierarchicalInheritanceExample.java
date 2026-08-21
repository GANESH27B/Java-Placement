class VehicleBase {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class CarVehicle extends VehicleBase {
    void drive() {
        System.out.println("Car drives");
    }
}

class BikeVehicle extends VehicleBase {
    void ride() {
        System.out.println("Bike rides");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        CarVehicle car = new CarVehicle();
        BikeVehicle bike = new BikeVehicle();
        car.start();
        car.drive();
        bike.start();
        bike.ride();
    }
}