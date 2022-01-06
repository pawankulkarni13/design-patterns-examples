package structural.bridge.remote;

public class RemoteDriver {
    public static void main(String[] args) {
        testDevices(new TV());
        testDevices(new Radio());
    }
    public static void testDevices(Device device) {
        System.out.println("Tests with basic remote.");
        var basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        var advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();

        device.printStatus();
    }
}
