package creational.abstractfactory.os.factory;

import creational.abstractfactory.os.ProductFactory;
import creational.abstractfactory.os.laptop.ChromeBook;
import creational.abstractfactory.os.laptop.Laptop;
import creational.abstractfactory.os.mobile.AndroidMobile;
import creational.abstractfactory.os.mobile.Mobile;

public class AndroidOSFactory implements ProductFactory {

    @Override
    public Mobile createMobilePhone() {
        return new AndroidMobile();
    }

    @Override
    public Laptop createLaptopModel() {
        return new ChromeBook();
    }
}
