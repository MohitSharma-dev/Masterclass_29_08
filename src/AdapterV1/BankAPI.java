package AdapterV1;

// In this interface have the methods which PhonePe wants to used
public interface BankAPI {
    public int checkBalance(String acc);
    public void transfer(String fromAcc, String toAcc, double amount);
}
