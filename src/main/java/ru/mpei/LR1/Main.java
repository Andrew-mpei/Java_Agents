package ru.mpei.LR1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String oldStr = scanner.nextLine();
        String firstNum = "", secondNum = "", oper = "";
        String[] str = oldStr.split("");
        boolean flag = false;
        for (String i : str){
            if (i.equals("+")){
                oper = "+";
                flag = true;
            } else if (i.equals("-")) {
                oper = "-";
                flag = true;
            } else if (i.equals("/")) {
                oper = "/";
                flag = true;
            } else if (i.equals("*")) {
                oper = "*";
                flag = true;
            }else if (flag == false) {
                firstNum += i;
            }else{
                secondNum += i;
            }
        }
        if (NumberIdentifier.isArabicNumber(firstNum) && NumberIdentifier.isArabicNumber(secondNum)){
            ArabicCalcs count = new ArabicCalcs(firstNum, secondNum);
            if (oper.equals("+")){
                count.addition();
            } else if (oper.equals("-")) {
                count.subtraction();
            }else if (oper.equals("*")){
                count.multiplication();
            } else if (oper.equals("/")) {
                count.division();
            }

        } else if (NumberIdentifier.isRomanNumber(firstNum) && NumberIdentifier.isRomanNumber(secondNum)) {
            RomanCalcs count = new RomanCalcs(firstNum, secondNum);
            if (oper.equals("+")){
                count.addition();
            } else if (oper.equals("-")) {
                count.subtraction();
            }else if (oper.equals("*")){
                count.multiplication();
            } else if (oper.equals("/")) {
                count.division();
            }

        }else{
            System.out.println("Неверный формат чисел, повторите ");
        }
    }
}