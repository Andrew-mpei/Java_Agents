package ru.mpei.HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите произвольную строку");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = scanner.nextLine();

        Validator[] validators = new Validator[]{new StrNotNull(), new OnlyEngAndNum(), new StringDataValidator()};

        try {
            for (int i = 0; i < validators.length; i++){
                validators[i].validate(str1, str2);
            }
        } catch (EmptyDataException e) {
            e.printStackTrace();
        } catch (UnknownCharacterException e){
            e.printStackTrace();
        }
    }
}
