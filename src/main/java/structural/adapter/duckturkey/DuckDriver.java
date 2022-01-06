package structural.adapter.duckturkey;

import structural.adapter.duckturkey.adapters.TurkeyAdapter;
import structural.adapter.duckturkey.duck.Duck;
import structural.adapter.duckturkey.duck.MallardDuck;
import structural.adapter.duckturkey.turkey.WildTurkey;

public class DuckDriver {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck duckAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says :: ");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println();

        System.out.println("The Duck says :: ");
        duckDrive(mallardDuck);

        System.out.println();
        System.out.println("The Turkey Adapted Duck says :: ");
        duckDrive(duckAdapter);
    }

    static void duckDrive(Duck duck){
        duck.quack();
        duck.fly();
    }

}
