abstract class AbstractVehicle {
    abstract void move();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class AbstractCar extends AbstractVehicle {
    @Override
    void move() {
        System.out.println("Car moves on the road");
    }
}

public class AbstractVehicleExample {
    public static void main(String[] args) {
        AbstractVehicle vehicle = new AbstractCar();
        vehicle.move();
        vehicle.stop();
    }
}