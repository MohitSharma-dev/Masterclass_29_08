package AdapterV0;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();

        phonePe.availLoan(200);
        phonePe.rechargeFastTag(500);
    }
}
