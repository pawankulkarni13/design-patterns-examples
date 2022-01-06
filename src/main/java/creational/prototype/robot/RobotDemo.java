package creational.prototype.robot;

public class RobotDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Robot robot = new Robot();
        System.out.println("Robot Says hello Version " + robot.version() + " with hash "+robot.hashCode());
        Robot robot2 = robot.clone();
        System.out.println("New Robot Says hello Version " + robot2.version() + " with hash "+robot2.hashCode());
    }
}
