package Banking;

class Withdraw implements Runnable {
    Bankaccount account;
    Withdraw(Bankaccount account){
        this.account=account;}
    @Override
    public void run(){
        account.withdraw();
    }
}

