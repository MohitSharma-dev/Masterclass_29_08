package AdapterV1;

public class ICICIBankAPI {
    public int balanceCheck(String account) {
        System.out.println("Get balance via ICICI");
        return 100;
    }

    public void moneyTransfer(String from, String to, double amount) {
        System.out.println("Money is being transferred via ICICI");
    }
}
