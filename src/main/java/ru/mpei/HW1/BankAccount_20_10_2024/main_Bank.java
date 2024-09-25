package ru.mpei.HW1.BankAccount_20_10_2024;

public class main_Bank {
    public static void main(String[] args) {

        BankAccount money = new BankAccount(200);
        System.out.println("На счету " + money.checkMoney() + " рублей");
        int rub =  30;
        System.out.println("Положим " + rub + " рублей");
        money.putMoney(30);
        System.out.println("На счету " + money.checkMoney() + " рублей");
        System.out.println("На счету долларов " + money.checkInDollars() );
        System.out.println("На счету евро " + money.checkInEuros());
        money.withdrawMoney();
        System.out.println("На счету " + money.checkMoney() + " рублей");

        ExchangeRates course = new ExchangeRates();
        System.out.println("Текущий курс доллара в рублях " + course.getDollar());
        System.out.println("Текущий курс евро в рублях " + course.getEuro());
    }
}
