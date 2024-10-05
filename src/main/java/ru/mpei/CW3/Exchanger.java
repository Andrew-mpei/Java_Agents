package ru.mpei.CW3;

import java.lang.reflect.Type;

public class Exchanger {


    public double convert(double num, String input, String output) {
        double rub = 0.0;
        double answer = 0.0;
        Converter[] converters = new Converter[]{
                new Dollar(), new Jena(), new Rub(), new Yane()
        };
        for (Converter converter : converters){
            if(converter.getType().equals(input)){
                rub = converter.convertToRub(num);
            }
        }
        for (Converter converter : converters){
            if(converter.getType().equals(output)){
                answer = converter.convertToCurency(rub);
            }
        }
        return answer;
    }



}
