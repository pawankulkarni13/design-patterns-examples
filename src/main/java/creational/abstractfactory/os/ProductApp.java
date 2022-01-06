package creational.abstractfactory.os;

import creational.abstractfactory.os.laptop.Laptop;
import creational.abstractfactory.os.mobile.Mobile;

public class ProductApp {
    Mobile mobile;
    Laptop laptop;

    public ProductApp(ProductFactory productFactory) {
        this.mobile = productFactory.createMobilePhone();
        this.laptop = productFactory.createLaptopModel();
    }
    public void createProducts(){
        mobile.createMobile();
        laptop.createLaptop();
    }
}
