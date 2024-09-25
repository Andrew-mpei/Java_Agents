package ru.mpei.HW1.Metodichka_Massivi;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        /**Task1*/
        System.out.println("Введите произвольную строку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str.split("");
        int i = str.length();
        while (i > 0) {
            System.out.print(str.charAt(i - 1));
            i--;
        }
    }

    public static void main2(String[] args) {
        /**Task2*/
        for (int i1 = 100; i1 > 0; i1--){
            System.out.print(" " + i1);
        }
    }

    public static void main3(String[] args) {
        /**Task3*/
        System.out.println();
        int N = 20;
        for (int i2 = 1; i2 < N; i2++){
            System.out.print(" " + Math.pow(2,i2));
        }
    }

    public static void main4(String[] args) {
        /**Task4*/
        int[] arr = {1, 2, 3, 0, 5, 0};
        int count = 0;
        for (int i : arr){
            if (i == 0){
                break;
            }
            count++;
        }
        System.out.println("\n" + " " + count);
    }

    public static void main5(String[] args) {
        /**Task5*/
        int num = 123045;
        int count = 0;
        for (int i = 0; i < num; i++){
            if ((num % 10) == 0){
                count += 1;
                break;
            }
            num /= 10;
        }
        if (count > 0){
            System.out.println("Да, содержит 0");
        }else{
            System.out.println("Не содержит 0");
        }
    }

    public static void main6(String[] args) {
        /**Task6*/
        String numb = Integer.toString(123456789);
        int[] newnumb = new int[numb.length()];
        for (int i = 0; i < numb.length(); i++)
        {
            newnumb[i] = numb.charAt(i) - '0';
            System.out.print(" " + newnumb[i]);
        }
        System.out.println();
    }

    public static void main7(String[] args) {
        /**Task7*/
        int[] num1 = new int[]{1,2,3,4,5};
        int[] num2 = new int[]{6,7,8,9,10,11,12};
        int[] numSum = new int[num1.length + num2.length];
        for (int i = 0; i < (num1.length); i++){
            numSum[i] = num1[i];
        }
        for (int i = 0; i < (num2.length); i++){
            numSum[i + num1.length] = num2[i];
        }

        for (int i = 0; i < (num1.length + num2.length); i++){
            System.out.print(" " + numSum[i]);;
        }
    }

    public static void main8(String[] args) {
        /**Task8*/
        String str = "aba";
        String[] arrStr = str.split("");
        boolean fl = true;
        for (int i = 0; i < arrStr.length; i++){
            if (!arrStr[i].equals(arrStr[arrStr.length - i - 1])){
                fl = false;
                break;
            }
        }
        if (fl){
            System.out.println("\n" + "Палиндром");
        }else{
            System.out.println("\n" + "Не палиндром");
        }
    }

    public static void main9(String[] args) {
        /**Task9*/
        int k = 5;
        double[] kD = new double[k];
        for (int i = 0; i < k; i++){
            kD[i] = Math.round(Math.random() * 100);
        }
        double min = kD[0];
        double max = min;
        double middle = 0.0;
        for (int i = 0; i < k; i++){
            if (kD[i] > max){
                max = kD[i];
            }if (kD[i] < min){
                min = kD[i];
            }
            middle +=kD[i];
        }

        System.out.print("Минимальное " + min);
        System.out.print(" Максимальное " + max);
        System.out.print(" Среднее " + middle + "\n");
    }

    public static void main10(String[] args) {
        /**Task10*/
        System.out.println("\n" + "Введите номер месяца ");
        Scanner scanner = new Scanner(System.in);
        Double mounth = Double.valueOf((scanner.nextLine()));
        while (mounth > 12 || mounth <= 0){
            System.out.println("Введите номер месяца не больше 12 и не меньше 0 ");
            scanner = new Scanner(System.in);
            mounth = Double.valueOf((scanner.nextLine()));
        }
        mounth /= 4;
        if (mounth <= 0.5 || mounth >= 2.75){
            System.out.println("Зима");
        } else if (mounth <= 1.25) {
            System.out.println("весна");
        } else if (mounth <= 2) {
            System.out.println("лето");
        }else{
            System.out.println("осень");
        }
    }

    public static void main11(String[] args) {
        /**Task11*/
        int [] mass = {7, 6, 5, 4, 3, 2};
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = 0; j < mass.length - 1 - i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }
        for (int ind : mass) {
            System.out.print(ind + " ");
        }
        System.out.println();
    }

    public static void main12(String[] args) {
        /**Task12*/
        int[][] ma = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ma[i][j] + " ");
            }
        }
    }
}
