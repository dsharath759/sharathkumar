package com.bank.classes;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]){
		String user_name=null,type;
		type = null;
		int balance=0,tmp=0;
		int withd=0,cb=0;

		int aNumber = 0; 
		//random account generation.
		aNumber = (int)((Math.random() * 9000)+1000); 

		AccountCreation user = new AccountCreation("user",0,0,"savings");

		Scanner in = new Scanner(System.in);
		Scanner strng=new Scanner(System.in);
		int userChoice;
		boolean quit = false;

		do {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit money");
			System.out.println("3. Withdraw money");
			System.out.println("4. Check balance");
			System.out.println("5. Display Account Details");
			System.out.println("6. Exit: \n");
			System.out.print("Enter Your Choice : ");
			userChoice = in.nextInt();
			switch (userChoice) {

			case 1:
				System.out.print("Enter your Name : ");
				user_name=strng.nextLine(); 
				System.out.print("Enter Accout Type : ");
				type=in.next();
				user.insert(user_name, aNumber, type);  // inserted 
				System.out.println("\n\tYour Account Details");
				System.out.println("**********************************");                       
				user.display_details();
				break;

			case 2:
				System.out.print("Enter your account Number : ");
				tmp=in.nextInt();
				if(tmp==user.accNum){
					System.out.print("Enter Amount Of Money : ");
					balance=in.nextInt();
					user.accBalance=balance;
					System.out.println("\t Successfully Deposited.");
				}                
				else
					System.out.println("Wrong Accoount Number.");          
				break;

			case 3:                      
				System.out.print("Enter your account Number : ");
				tmp=in.nextInt();

				if(tmp==user.accNum){                         
					if(user.accBalance==0)
						System.out.print("Your Account is Empty.");

					else{
						System.out.print("Enter Amout Of Money : ");   
						withd=in.nextInt();  

						if(withd>user.accBalance){
							System.out.print("Enter Valid Amout of Money : ");
							withd=in.nextInt();
						}
						else
							cb= user.withdraw(withd);
						System.out.println("Your Current Balance : "+cb);   
					}
				}
				else
					System.out.println("Wrong Accoount Number.");  
				break;

			case 4: // check balance 

				System.out.print("Enter your Account Number : ");
				tmp=in.nextInt();

				if(tmp==user.accNum){
					System.out.println("Your Current Balance : "+user.accBalance);
				}
				else
					System.out.println("Wrong Accoount Number.");                         
				break;

			case 5: 

				System.out.print("Enter your Account Number :");
				tmp=in.nextInt();                     
				if(tmp==user.accNum){                               
					user.display_details();                             
				}else
					System.out.println("Wrong Account Number.");

				break;
			case 6:
				quit = true;
				break;
			default:
				System.out.println("Wrong Choice.");
				break;
			}
			System.out.println("\n");
		} while (!quit);
		System.out.println("Thanks !");
	} 
} 
