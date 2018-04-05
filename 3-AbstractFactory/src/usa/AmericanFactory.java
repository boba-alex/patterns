package usa;

import interfaces.AirCraft;
import interfaces.Car;
import interfaces.TransportFactory;

/**
 * Created by User on 05.04.2018.
 */
public class AmericanFactory implements TransportFactory{
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public AirCraft createAirCraft() {
        return new Boeing();
    }
}
