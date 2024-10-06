package ru.mpei.HW3;

public class OnlyEngAndNum implements Validator {
    private String eng = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOASDFGHJKLZXCVBNM1234567890";
    private String[] english = eng.split("");


    @Override
    public boolean validate(String first, String second) {
        String[] str1 = first.split("");
        String[] str2 = second.split("");
        if (!check(str1, 1) || !check(str2, 2)) {
            throw new UnknownCharacterException();
        }else{
            return true;
        }
    }

    private boolean check(String[] strNew, int i) {

        //перебор по строке ввода
        for (int ii = 0; ii < strNew.length; ii++) {
            int count = 0;
            //перебор по всем английским буквам и цифрам
            for (int iii = 0; iii < english.length; iii++) {
                if (english[iii].equals(strNew[ii])) {
                    count++;
                }
            }
            if (count == 0){
                System.out.println("В строке " + i + " найден не английский символ или не цифра");
                return false;
            }
        }
        return true;
    }
}
