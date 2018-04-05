package start;

import context.TransformerContext;
import state.FireState;
import state.MoveState;
import state.TransformerState;

/**
 * Created by User on 05.04.2018.
 */
public class Main {
    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
    }
}
