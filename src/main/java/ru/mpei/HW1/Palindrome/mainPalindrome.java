package ru.mpei.HW1.Palindrome;

public class mainPalindrome {
    public static void main(String[] args) {
        int number = 123;
        Palindrome isPalindrome = new Palindrome(number);
        if (isPalindrome.isPalindrome()){
            System.out.println("Палиндром");
        }if (number > 0){
            System.out.println("Сумма цифр " + isPalindrome.sumOfNumbers());
            System.out.println("Не палиндром");
        }else{
            System.out.println("Не палиндром, число отрицательное");
        }


    }
}
