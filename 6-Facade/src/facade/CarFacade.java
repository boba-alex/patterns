package facade;

import parts.Door;
import parts.Transmission;
import parts.Wheel;

/**
 * Created by User on 05.04.2018.
 */
public class CarFacade {
    private Door door = new Door();
    private Transmission transmission = new Transmission();
    private Wheel wheel = new Wheel();
    public void go(){
        door.open();
        transmission.start();
        wheel.turn();
    }
}
