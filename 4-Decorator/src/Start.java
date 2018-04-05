import decorators.BorderDecorator;
import decorators.ColorDecorator;
import objects.Button;
import objects.Component;
import objects.TextView;
import objects.Window;

/**
 * Created by User on 05.04.2018.
 */
public class Start {

    private static Component window;

    private static Component textView;

    private static Component button;

    public static void main(String[] args) {

        boolean showBorder = true;

        if (!showBorder) {
            window = new Window();
            textView = new TextView();
            button = new Button();
        } else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }

        //Component windowWithBorder = new ColorDecorator(new BorderDecorator(new Window()));
        window.draw();
        textView.draw();
        button.draw();
    }
}
