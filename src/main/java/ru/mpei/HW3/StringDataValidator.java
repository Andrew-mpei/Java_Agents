package ru.mpei.HW3;

public class StringDataValidator implements Validator{
    @Override
    public boolean validate(String first, String second) {
        if (first.equals(second)){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }
    }
}
