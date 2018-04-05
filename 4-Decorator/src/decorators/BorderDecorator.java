package decorators;

import objects.Component;

/**
 * Created by User on 05.04.2018.
 */
public class BorderDecorator extends  Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... add border");
    }
}
