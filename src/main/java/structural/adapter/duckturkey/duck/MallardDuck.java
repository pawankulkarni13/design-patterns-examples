package structural.adapter.duckturkey.duck;

import structural.adapter.duckturkey.duck.Duck;

public class MallardDuck implements Duck {
    public void quack(){
        System.out.println("Quack");
    }
    public void fly(){
        System.out.println("I Fly for long distance !!!");
    }
}
