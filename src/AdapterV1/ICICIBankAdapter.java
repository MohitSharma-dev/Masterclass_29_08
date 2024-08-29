package AdapterV1;

public class ICICIBankAdapter implements BankAPI{
    private ICICIBankAPI icicibankAPI = new ICICIBankAPI();
    @Override
    public int checkBalance(String acc) {
        return icicibankAPI.balanceCheck(acc);
    }

    @Override
    public void transfer(String fromAcc, String toAcc, double amount) {
        icicibankAPI.moneyTransfer(fromAcc, toAcc, amount);
    }
}
