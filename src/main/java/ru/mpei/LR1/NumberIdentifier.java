package ru.mpei.LR1;

public class NumberIdentifier {
    public static boolean isArabicNumber(String number){
        String[] str = new String[11];
        boolean fl = false;
        for (int i = 0; i <= 10; i++){
            str[i] = String.valueOf(i);
        }
        for (int i = 0; i <= 10; i++){
            if (number.equals(str[i])){
                fl = true;
            }
        }
        return fl;
    }
    public static boolean isRomanNumber(String number){
        String[] str = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean fl = false;
        for (int i = 0; i < 10; i++){
            if (number.equals(str[i])){
                fl = true;
            }
        }
        return fl;
    }
}
