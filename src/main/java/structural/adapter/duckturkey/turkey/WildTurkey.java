package structural.adapter.duckturkey.turkey;

import structural.adapter.duckturkey.turkey.Turkey;

public class WildTurkey implements Turkey {
    public void gobble(){
        System.out.println("Gobble Gobble");
    }
    public void fly(){
        System.out.println("I fly for short distance !!");
    }
}
