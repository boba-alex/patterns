package auth;

import strategy.AuthStrategy;

/**
 * Created by User on 05.04.2018.
 */
public class UserChecker {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean check(AuthStrategy authStrategy){
        return authStrategy.checkLogin(name, password);
    }
}
