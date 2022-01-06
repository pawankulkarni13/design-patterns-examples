package creational.prototype.robot;

public class Robot implements Cloneable {

    public String version(){
        return "2.0";
    }

    @Override
    protected Robot clone() throws CloneNotSupportedException {
        Robot clone = null;

        try {
            clone = (Robot) super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
