package Banking;

import java.util.Scanner;
public class Mpesa {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Time t=new Time();
        Thread a=new Thread(t);
        Bankaccount account =new Bankaccount();
        Withdraw s=new Withdraw(account);
        Thread b=new Thread(s);
        a.setDaemon(true);
        a.start();
        System.out.println("Withdraw");
        System.out.println("You have 10 seconds to enter your pin");
        System.out.print("Enter your pin:");
        int pin= input.nextInt();
        if (pin==1945){
            b.start();
        }else{
            System.out.println("Try again!");
        }


    }
}