package ru.mpei.LR1;

public abstract class Calculations {
    private String num1;
    private String num2;
    public abstract void addition();
    public abstract void  subtraction();
    public abstract void  multiplication();
    public abstract void  division();

    public Calculations(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }

}
