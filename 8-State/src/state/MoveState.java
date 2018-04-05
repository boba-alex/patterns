package state;

/**
 * Created by User on 05.04.2018.
 */
public class MoveState implements TransformerState{
    @Override
    public void action() {
        System.out.println("move!");
    }
}
