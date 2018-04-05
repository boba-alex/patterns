package usa;

import interfaces.Car;

/**
 * Created by User on 04.04.2018.
 */
public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Porsche drive");
    }

    @Override
    public void stop() {
        System.out.println("Porsche stop");
    }
}
