package Banking;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Bankaccount account =new Bankaccount();
        Withdraw b=new Withdraw(account);
        Thread t=new Thread(b);
        Deposit d=new Deposit(account);
        Thread t2=new Thread(d);
        Balance z=new Balance(account);
        Thread t3=new Thread(z);
        System.out.println("1=withdraw");
        System.out.println("2=deposit");
        System.out.println("3=checkbalance");
        System.out.println("Select number(1-3):");
        int number=input.nextInt();
        if(number==1){
            t.start();
        } else if (number==2) {

                t2.start();
        } else if (number==3){

                t3.start();}
        try{
            t.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        LocalDateTime n=LocalDateTime.now();
        System.out.println(n);
    }
}
