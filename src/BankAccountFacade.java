public class BankAccountFacade {


    private int accountNumber;
    private int securityCode;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeCheck;
    FundsCheck fundsCheck;

    WelcomeToBank bankWelcome;



    public BankAccountFacade(int newAcctNum, int newSecCode){
        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        codeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
    }


    public int getAccountNumber(){
        return accountNumber;
    }

    public int getSecurityCode(){
        return securityCode;
    }


    public void withdrawCash(double cahToGet){
        if(acctChecker.accountActive(getAccountNumber()) &&
                codeCheck.isCodeCorrect(getSecurityCode()) &&
                fundsCheck.haveEnoughMoney(cahToGet)){
            System.out.println("Transaction Complete");
        }else{
            System.out.println("Transaction Failed");
        }
    }


    public void depositCash(double cashToDeposit){
        if(acctChecker.accountActive(getAccountNumber())&&
        codeCheck.isCodeCorrect(getSecurityCode())){
            fundsCheck.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete");
        }else{
            System.out.println("Transaction Failed");
        }
    }


}
