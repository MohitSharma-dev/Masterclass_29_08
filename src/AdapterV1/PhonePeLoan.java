package AdapterV1;

public class PhonePeLoan {
    public int checkEligibility(int amt, BankAPI bankAPI) {
        int balance = bankAPI.checkBalance("1");
        if(balance >= .2 * amt){
            return 1;
        }
        return 0;
    }
}
