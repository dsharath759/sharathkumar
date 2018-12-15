package com.programs;

import java.util.Scanner;
public class Bank
{
    public static void main(String args[] )
    { 
        int balance = 0, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
        	System.out.println("====options====\n");
            System.out.println("1-> Withdraw");
            System.out.println("2-> Deposit");
            System.out.println("3-> Balance");
            System.out.println("4-> EXIT");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("\nEnter amount to be withdraw:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Remaining balance : "+balance);
                }
                else
                {
                    System.out.println("Insufficient Amount in account\n");
                }
                break; 
                case 2:
                System.out.print("Enter amount to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Amount successfully depsited in your account\n");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}
