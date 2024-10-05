package ru.mpei.CW3;

import java.lang.reflect.Type;

public interface Converter {
    double convertToRub(double ue);
    double convertToCurency(double rub);
    Type getType();
}
