class Banking implements Runnable {
    Bankaccount account;
    Banking(Bankaccount account){
        this.account=account;}
    @Override
    public void run(){
        account.withdraw(67300);
    }
}

