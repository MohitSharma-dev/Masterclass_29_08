package AdapterV1;

public class PhonePe {
    private BankAPI bankAPI;
    private PhonePeLoan phonePeLoan;
    private FastTagRecharge fastTagRecharge;

    PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
        phonePeLoan = new PhonePeLoan();
        fastTagRecharge = new FastTagRecharge();
    }

    public boolean availLoan(int amt){
        if(phonePeLoan.checkEligibility(amt, bankAPI) == 1){
            System.out.println("Loan approved");
            return true;
        }
        return false;
    }

    public boolean rechargeFastTag(int amt){
        try{
            fastTagRecharge.recharge(amt , bankAPI);
            System.out.println("Recharge is done");
            return true;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
