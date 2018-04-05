package state;

/**
 * Created by User on 05.04.2018.
 */
public class FireState implements TransformerState{
    @Override
    public void action() {
        System.out.println("fire!");
    }
}
