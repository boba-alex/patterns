package objects;

import facade.CarFacade;
import parts.Door;
import parts.Transmission;
import parts.Wheel;

/**
 * Created by User on 05.04.2018.
 */
public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        door.open();

        Transmission transmission = new Transmission();
        transmission.start();

        Wheel wheel = new Wheel();
        wheel.turn();

        //facade
        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
