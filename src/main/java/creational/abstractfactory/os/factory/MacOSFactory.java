package creational.abstractfactory.os.factory;

import creational.abstractfactory.os.ProductFactory;
import creational.abstractfactory.os.laptop.Laptop;
import creational.abstractfactory.os.laptop.MacBook;
import creational.abstractfactory.os.mobile.AppleMobile;
import creational.abstractfactory.os.mobile.Mobile;

public class MacOSFactory implements ProductFactory {
    @Override
    public Mobile createMobilePhone() {
        return new AppleMobile();
    }

    @Override
    public Laptop createLaptopModel() {
        return new MacBook();
    }
}
