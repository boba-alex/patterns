package russia;

import interfaces.AirCraft;
import interfaces.Car;
import interfaces.TransportFactory;

/**
 * Created by User on 05.04.2018.
 */
public class RussianFactory implements TransportFactory{
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public AirCraft createAirCraft() {
        return new TU134();
    }
}
