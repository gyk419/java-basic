package oop1.ex;

public class Account {
    int balance;

    int deposit(int amount){
        balance = balance + amount;
        return balance;
    }
    int withdraw(int amount){
        if(balance >= amount){
            balance = balance - amount;
        } else {
            System.out.println("잔액부족");
        }
        return balance;
    }

    void printBalance(){
        System.out.println("잔고: " + balance);
    }
}
