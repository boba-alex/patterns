package russia;

import interfaces.Car;

/**
 * Created by User on 04.04.2018.
 */
public class Niva implements Car {
    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stop");
    }
}
