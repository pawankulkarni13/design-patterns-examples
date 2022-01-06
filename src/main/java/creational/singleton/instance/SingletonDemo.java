package creational.singleton.instance;

public class SingletonDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingletonObject object = SingletonObject.getInstance();

        //show the message
        object.showMessage();

        SingletonObject object2 = SingletonObject.getInstance();
        object2.showMessage();
        if(object.equals(object2) && object.hashCode() == object2.hashCode()){
            System.out.println("Same Object !!");
        }
    }
}
