package AdapterV0;

public class PhonePeLoan {
    public int checkEligibility(int amt, YesBankAPI yesBankAPI) {
        int balance = yesBankAPI.getBalance("1");
        if(balance >= .2 * amt){
            return 1;
        }
        return 0;
    }
}
