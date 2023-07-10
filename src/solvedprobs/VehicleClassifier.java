package solvedprobs;

class Vehicle{
    public void start(){
        System.out.println("Vehicle Started");
    }
    public void stop(){
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("Car Started");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }
}

class Motorcycle extends Vehicle{
    public void start(){
        System.out.println("Motorcycle Started");
    }
    public void stop(){
        System.out.println("Motorcycle Stopped");
    }
}
public class VehicleClassifier {
    public static void main(String[] args) {
        Vehicle newVehicle = new Vehicle();
        newVehicle.start();
        newVehicle.stop();

        Car newCar = new Car();
        newCar.start();
        newCar.stop();

        Motorcycle newMotorcycle = new Motorcycle();
        newMotorcycle.start();
        newMotorcycle.stop();
    }
}
