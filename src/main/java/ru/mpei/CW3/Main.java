package ru.mpei.CW3;

public class Main {
    public static void main(String[] args) {
        Exchanger exchanger = new Exchanger();
        double ans = exchanger.convert(300, "jena", "dollar");
        System.out.println(ans);
    }
}
