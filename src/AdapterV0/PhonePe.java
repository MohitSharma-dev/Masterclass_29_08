package AdapterV0;

public class PhonePe {
    private YesBankAPI yesBankAPI;
    private PhonePeLoan phonePeLoan;
    private FastTagRecharge fastTagRecharge;

    PhonePe() {
        yesBankAPI = new YesBankAPI();
        phonePeLoan = new PhonePeLoan();
        fastTagRecharge = new FastTagRecharge();
    }

    public boolean availLoan(int amt){
        if(phonePeLoan.checkEligibility(amt, yesBankAPI) == 1){
            System.out.println("Loan approved");
            return true;
        }
        return false;
    }

    public boolean rechargeFastTag(int amt){
        try{
            fastTagRecharge.recharge(amt , yesBankAPI);
            System.out.println("Recharge is done");
            return true;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
