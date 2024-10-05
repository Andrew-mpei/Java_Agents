package ru.mpei.HW2;

public class Main {
    public static void main(String[] args) {
        SteriodArray steriodArray = new SteriodArray();
        steriodArray.add("YYY");

        steriodArray.remove("3");
        steriodArray.remove(1);
        steriodArray.get(3);
        System.out.println("Переопределение метода toString: " + steriodArray.toString());
        System.out.println("Текущий реальный размер добавленных строк равен: " + steriodArray.length());
        System.out.println("Максимальный размер строки в массиве равен " + steriodArray.maxLength());
    }
}
