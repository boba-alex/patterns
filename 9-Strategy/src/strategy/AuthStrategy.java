package strategy;

/**
 * Created by User on 05.04.2018.
 */
public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
