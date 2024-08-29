package AdapterV1;

public class YesBankAPIAdapter implements BankAPI{
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public int checkBalance(String acc) {
        return yesBankAPI.getBalance(acc);
    }

    @Override
    public void transfer(String fromAcc, String toAcc, double amount) {
        yesBankAPI.transferMoney(fromAcc, toAcc, amount);
    }
}
