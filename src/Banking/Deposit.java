package Banking;

class Deposit implements Runnable {
    Bankaccount account;
    Deposit(Bankaccount account){
        this.account=account;
    }
    @Override
    public void run(){
        account.deposit();
    }
}
