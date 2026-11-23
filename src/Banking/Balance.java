package Banking;

class Balance implements Runnable{
    Bankaccount account;
            Balance( Bankaccount account){
        this.account=account;
            }
    @Override
    public void run(){
        account.checkbalance();
    }
}
