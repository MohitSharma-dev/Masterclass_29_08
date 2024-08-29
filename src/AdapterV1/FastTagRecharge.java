package AdapterV1;

public class FastTagRecharge {
    public void recharge(int amt, BankAPI bankAPI){
        int balance = bankAPI.checkBalance("1");
        if(balance >= amt){
            System.out.println("Recharge is done");
        } else {
            throw new RuntimeException("Insufficient funds");
        }
    }
}
