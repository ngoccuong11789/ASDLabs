package Labs.FactoryPattern;

public class AccountDAOFactory {

    public static AccountDAO getAccountDAO() {
        if (isTestEnvironment()) {
            return new MockAccountDAO();
        } else {
            return new AccountDAOImpl();
        }
    }

    private static boolean isTestEnvironment() {
        return System.getProperty("env", "prod").equals("test");
    }

}
