package AdapterV1;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String bankName = scanner.nextLine();
        BankAPI bankAPI = BankAPIFactory.getBankAPI(bankName);
        PhonePe phonePe = new PhonePe(bankAPI);

        phonePe.availLoan(200);
        phonePe.rechargeFastTag(500);
    }
}
// If a new bank comes , PhonePe just needs to create a new Adapter
