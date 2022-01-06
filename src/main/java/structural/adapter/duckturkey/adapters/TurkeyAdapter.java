package structural.adapter.duckturkey.adapters;

import structural.adapter.duckturkey.duck.Duck;
import structural.adapter.duckturkey.turkey.Turkey;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }
    public void fly(){
        for(var i=0;i<3;i++) {
            turkey.fly();
        }
    }
}
