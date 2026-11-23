package Banking;

import java.util.Scanner;
import Banking.Time;
class Bankaccount {
    Scanner input =new Scanner(System.in);
    Time t=new Time();
    Thread c=new Thread(t);
    int setpin=1945;
    int balance=90000;
    synchronized void withdraw(){
        System.out.println("Enter amount to withdraw:");
        int amount= input.nextInt();
        c.setDaemon(true);
        c.start();
        System.out.print("Enter your pin:");
        int pin=input.nextInt();
        if(pin==setpin) {
            if (balance >= amount) {
                balance = balance - amount;//placed inside this if statement
                //if outside incase current balance-amount=balance lower than amount it will say not enough amount
                System.out.println(Thread.currentThread().getName() + " is Withdrawing " + amount);
                System.out.println("Balance:" + balance);
            } else {
                System.out.println("Trying to withdraw " + amount + "Ksh,Not enough amount");
            }
        } else {
            System.out.println("Wrong pin try again");
        }
    }
    synchronized void deposit(){
        System.out.println("Enter amount to deposit:");
        int amount= input.nextInt();
        c.setDaemon(true);
        c.start();
     System.out.print("Enter your pin:");
     int pin= input.nextInt();
     if (pin==setpin) {
         balance = balance + amount;
         System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
         System.out.println("Balance:" + balance);
     }else {
         System.out.println("Wrong pin,try again");
     }
    }
    void checkbalance(){
        c.setDaemon(true);
        c.start();
        System.out.println("Enter your pin:");
        int pin= input.nextInt();
        if(pin==setpin){
        System.out.println("Your current balance is:"+balance);
        }else{
            System.out.println("Wrong pin,try again");
        }

    }
}
