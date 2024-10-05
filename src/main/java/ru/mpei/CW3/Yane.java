package ru.mpei.CW3;

import java.lang.reflect.Type;

public class Yane implements Converter{

    @Override
    public double convertToRub(double ue) {
        return 0;
    }

    @Override
    public double convertToCurency(double rub) {
        return 0;
    }

    @Override
    public Type getType() {
        return null;
    }
}
