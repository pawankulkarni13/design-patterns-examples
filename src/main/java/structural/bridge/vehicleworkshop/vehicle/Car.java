package structural.bridge.vehicleworkshop.vehicle;

import structural.bridge.vehicleworkshop.workshop.Workshop;

public class Car extends Vehicle {
    public Car(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Car ");
        workShop1.work();
        workShop2.work();
    }
}
