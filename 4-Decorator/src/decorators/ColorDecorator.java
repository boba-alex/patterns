package decorators;

import objects.Component;

/**
 * Created by User on 05.04.2018.
 */
public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... add color");
    }
}
