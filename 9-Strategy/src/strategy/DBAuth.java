package strategy;

/**
 * Created by User on 05.04.2018.
 */
public class DBAuth implements AuthStrategy {

    private Object dbRef;
    private String dbUrl;

    public DBAuth(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    private void createConnection(String dbUrl){

    }

    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Checking with DB...");

        String userHash = getHash(name);
        String passHash = getHash(password);

        return checkUser(userHash, passHash);
    }

    private boolean checkUser(String name, String password){

        return true;
    }

    private String getHash(String value){

        return "asdfghj";
    }
}
