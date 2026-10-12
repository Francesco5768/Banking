import java.time.LocalDateTime;
public class Bank {
    public static void main(String[] args){
        Bankaccount account =new Bankaccount();
        Banking b=new Banking(account);
        Thread t=new Thread(b);
        Thread t1=new Thread(b);
        Deposit d=new Deposit(account);
        Thread t2=new Thread(d);
        t.start();
        t1.start();
        t2.start();
        LocalDateTime n=LocalDateTime.now();
        System.out.println(n);
    }
}
