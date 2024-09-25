package ru.mpei.HW1.BankAccount_20_10_2024;

public class ExchangeRates{
    private final double euro;
    private final double dollar;

    public ExchangeRates() {
        this.euro = 100;
        this.dollar = 90;
    }

    public double getEuro() {
        return euro;
    }

    public double getDollar() {
        return dollar;
    }
}
