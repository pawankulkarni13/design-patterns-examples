package creational.abstractfactory.os.laptop;

public class ChromeBook implements Laptop {
    @Override
    public void createLaptop() {
        System.out.println("You have created a Chrome Book.");
    }
}
