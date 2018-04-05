package objects;

import adapter.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 05.04.2018.
 */
public class Client {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);
    }
}
