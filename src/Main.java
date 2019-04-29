public class Main {

    public static void main(String[] args) {

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(400);

        accessingBank.depositCash(5000);


    }
}
