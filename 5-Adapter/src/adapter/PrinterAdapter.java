package adapter;

import objects.Printer;

import javax.xml.stream.events.StartElement;
import java.util.List;

/**
 * Created by User on 05.04.2018.
 */
public class PrinterAdapter implements  PageListPrinter{
    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for(String text: list){
            printer.print(text);
        }
    }
}
