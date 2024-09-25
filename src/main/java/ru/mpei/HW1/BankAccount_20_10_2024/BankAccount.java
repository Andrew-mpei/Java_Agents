package ru.mpei.HW1.BankAccount_20_10_2024;

public class BankAccount extends ExchangeRates{
    private int money;

    public int checkMoney(){
        return money;
    }
    public int putMoney(int quantity){
        return (money += quantity);
    }

    public BankAccount(int money) {
        this.money = money;
    }

    public int withdrawMoney(){
        int beforeClean = money;
        money = 0;
        return beforeClean;
    }

    public double checkInDollars(){
        return money/getDollar();
    }

    public double checkInEuros(){
        return money/getEuro();
    }
}
