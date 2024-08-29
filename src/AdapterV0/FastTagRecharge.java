package AdapterV0;

public class FastTagRecharge {
    public void recharge(int amt, YesBankAPI yesBankAPI){
        int balance = yesBankAPI.getBalance("1");
        if(balance >= amt){
            System.out.println("Recharge is done");
        } else {
            throw new RuntimeException("Insufficient funds");
        }
    }
}
