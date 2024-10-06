package ru.mpei.HW3;

public class StrNotNull implements Validator{

    @Override
    public boolean validate(String first, String second) {
        if (first == null || first.equals("")){
            System.err.println("первая строка нулевая");
            throw new EmptyDataException();
        } else if (second == null || second.equals("")){
            System.err.println("вторая строка нулевая");
            throw new EmptyDataException();
        }
        return true;
    }
}
