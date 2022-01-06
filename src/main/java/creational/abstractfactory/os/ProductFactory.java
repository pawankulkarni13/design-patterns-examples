package creational.abstractfactory.os;

import creational.abstractfactory.os.laptop.Laptop;
import creational.abstractfactory.os.mobile.Mobile;

/**
 * Abstract factory knows about all products in the list.
 */
public interface ProductFactory {
    Mobile createMobilePhone();
    Laptop createLaptopModel();
}
