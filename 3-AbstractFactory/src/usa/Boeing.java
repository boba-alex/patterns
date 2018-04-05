package usa;

import interfaces.AirCraft;

/**
 * Created by User on 05.04.2018.
 */
public class Boeing implements AirCraft {
    @Override
    public void flight() {
        System.out.println("Boeing");
    }
}
