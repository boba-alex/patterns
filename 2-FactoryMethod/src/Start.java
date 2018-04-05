/**
 * Created by User on 04.04.2018.
 */
public class Start {
    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();
        Car geep = new Geep();
        geep.drive();

        Car car = carSelector.getCar(RoadType.OFF_ROAD);
        car.drive();
    }
}
