/*
You are asked to create a vehicle classifier app that creates and manages vehicle instances. Implement a Java program u to model this scenario.
Create a Vehicle entity with the following behvaiour:
start(): This method should print “Vehicle started.”
stop(): This method should print “Vehicle stopped.”
Create two more entities, Car and Motorcycle, which inherit from the Vehicle entity. The criteria are as follows:
In the Car class, the start() method should print “Car started” and the stop() method should print “Car stopped.”
In the Motorcycle class, the start() method should print “Motorcycle started” and the stop() method should print “Motorcycle stopped.”
Write a java code snippet to demonstrate the usage of these classes.
 */
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
