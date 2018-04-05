/**
 * Created by User on 04.04.2018.
 */
public class TestSingleton {

    private static TestSingleton instance;

    public static synchronized TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

    // so we can't create this out of class
    private TestSingleton() {
    }

    public void print() {
        System.out.println(this);
    }
}
