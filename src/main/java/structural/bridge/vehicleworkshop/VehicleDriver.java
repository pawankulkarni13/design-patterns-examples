package structural.bridge.vehicleworkshop;

import structural.bridge.vehicleworkshop.vehicle.Bike;
import structural.bridge.vehicleworkshop.vehicle.Car;
import structural.bridge.vehicleworkshop.vehicle.Vehicle;
import structural.bridge.vehicleworkshop.workshop.Assemble;
import structural.bridge.vehicleworkshop.workshop.Produce;

/**
 * Without Bridge Design Pattern we would unnecessarily create CarProduction, CarAssemble, BikeProduction, BikeAssemble classes.
 * Refer VehicleWithoutBridge.png and VehicleWithBridge.png for more details.
 */
public class VehicleDriver {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
    //Here we produce and assemble two different vehicles using Bridge design pattern.
}
