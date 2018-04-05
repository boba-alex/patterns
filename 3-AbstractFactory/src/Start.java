import interfaces.AirCraft;
import interfaces.Car;
import interfaces.TransportFactory;
import russia.Niva;
import russia.RussianFactory;
import usa.AmericanFactory;

/**
 * Created by User on 04.04.2018.
 */
public class Start {

    private static TransportFactory factory;

    public static void main(String[] args) {
        if (true) {
            factory = new RussianFactory();
        } else {
            factory = new AmericanFactory();
        }

        AirCraft airCraft = factory.createAirCraft();
        airCraft.flight();
    }
}
