package ru.mpei.HW1.Palindrome;

import java.util.ArrayList;
import java.util.LinkedList;

public class Palindrome {
    private ArrayList<Integer> linkedListEnd = new ArrayList<>();;
    private int number;
    private int sum;
    public boolean isPalindrome(){
        int i = number;

        if (i < 0){
            return false;
        }else{
            while (i > 0){
                linkedListEnd.add(i % 10);
                i /= 10;
            }
            i = number;
            for (int count = 0; count < linkedListEnd.size(); count++){
                if (linkedListEnd.get(count) != linkedListEnd.get(linkedListEnd.size()-count-1)){
                    return false;
                }
            }
            return true;
        }
    }
    public int sumOfNumbers(){
        for (int count = 0; count < linkedListEnd.size(); count++){
            sum += linkedListEnd.get(count);
        }
        return sum;
    }

    public Palindrome(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
