package ru.mpei.CW3;

import java.lang.reflect.Type;

public class Dollar implements Converter{
    @Override
    public double convertToRub(double ue) {
        return 90 * ue;
    }

    @Override
    public double convertToCurency(double rub) {
        return rub / 90;
    }

    @Override
    public Type getType() {
        return null;
    }
}
