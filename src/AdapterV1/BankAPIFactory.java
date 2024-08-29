package AdapterV1;

public class BankAPIFactory {
    public static BankAPI getBankAPI(String bankName) {
        BankAPI bankAPI = null;
        if(bankName.equals("YesBank")) {
            bankAPI = new YesBankAPIAdapter();
        } else if (bankName.equals("ICICIBank")) {
            bankAPI = new ICICIBankAdapter();
        }
        return  bankAPI;
    }
}

// Rain water trapping

// O(N2)
// O(N) O(N)
// O(N) O(1)

// Google Maps
// findPath via Car
// findPath via Bike
// findPath via Walk
