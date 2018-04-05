package start;

import auth.UserChecker;
import strategy.DBAuth;
import strategy.FileAuth;

import java.io.File;

/**
 * Created by User on 05.04.2018.
 */
public class Main {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new DBAuth("/sada"));

        userChecker.check(new FileAuth(new File("dfdsf.txt")));
    }
}
