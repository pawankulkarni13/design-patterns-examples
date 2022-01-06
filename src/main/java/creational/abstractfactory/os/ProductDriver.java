package creational.abstractfactory.os;

import creational.abstractfactory.os.factory.AndroidOSFactory;
import creational.abstractfactory.os.factory.MacOSFactory;

public class ProductDriver {
    private static ProductApp configureApplication() {
        ProductApp app;
        ProductFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new ProductApp(factory);
        } else {
            //Should Have been a Windows Factory But Since I own MacBook wanted to use the Mac flow.
            factory = new AndroidOSFactory();
            app = new ProductApp(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        ProductApp app = configureApplication();
        app.createProducts();
    }
}
