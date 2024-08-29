package AdapterV1;

public class YesBankAPI {
    public int getBalance(String account) {
        System.out.println("Get balance via YesBank");
        return 100;
    }

    public void transferMoney(String from, String to, double amount) {
        System.out.println("Money is being transferred via YesBank");
    }
}
