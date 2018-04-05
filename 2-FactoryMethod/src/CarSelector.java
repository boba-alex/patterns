/**
 * Created by User on 04.04.2018.
 */
//фабрика по созданию автомобилей
public class CarSelector {

    //создание нужного автомобиля
    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType){
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new NewGeep();
                break;
        }
        return car;
    }
}
