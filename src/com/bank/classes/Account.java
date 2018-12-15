package com.bank.classes;

class Account{
	String name,accType;
	int accNum,accBalance;
	Account(){

	}
	Account(String n,int acc_num,int b,String a_t){
		name=n;
		accNum=acc_num;
		accBalance=b;
		accType=a_t;
	}
} 
