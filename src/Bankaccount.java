class Bankaccount {
    int balance=90000;
    synchronized void withdraw(int amount){
        if (balance>=amount) {
            balance = balance - amount;//placed inside this if statement
            //if outside incase current balance-amount=balance lower than amount it will say notenough amouny
            System.out.println(Thread.currentThread().getName()+" is Withdrawing " + amount);
            System.out.println("Balance:" + balance);
        }
        else{
            System.out.println("Trying to withdraw,Not enough amount");
        }
    }
    synchronized void deposit(int amount){
        balance=balance+amount;
        System.out.println(Thread.currentThread().getName()+" is depositing " +amount);
        System.out.println("Balance:"+balance);
    }
}
