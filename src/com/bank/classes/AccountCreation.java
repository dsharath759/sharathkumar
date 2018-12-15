package com.bank.classes;

class AccountCreation extends Account{
	AccountCreation(String n,int accNum,int b,String a_t){ // pass name and account type 
		this.name=n;
		this.accNum=accNum;
		this.accBalance=b;
		this.accType=a_t;
	}
	AccountCreation(){
		super();
	}

	void insert(String n,int acc_num,String a_t) {
		name=n;
		accType=a_t;
		//generation random account number
		accNum=acc_num;
		accBalance=0;
	}

	void display_details(){
		System.out.println("Account Holder Name :" +name);
		System.out.println("Account Number      : "+accNum);
		System.out.println("Account Balance     : "+accBalance);
		System.out.println("Account Type        : "+accType);
	}

	void deposite(int acc_num,int money){                 
		accBalance=money;    
	}

	int withdraw(int withd){
		accBalance=accBalance-withd;
		return accBalance;
	}

} 