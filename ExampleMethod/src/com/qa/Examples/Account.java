package com.qa.Examples;

class Account {

	String customerName;
	int money;
	
Account (String customerName){
	this.customerName=customerName;
	this.money=0;
}

public int getMoney() {
	return money;
}

public void setMoney(int moneyIn) {
	this.money += moneyIn;
}

}