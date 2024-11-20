package ru.mpei.HW4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutoCallableAnnotationPostProcessorTest {

    @Test
    public void postProcessorTest1(){
        AutoCallableAnnotationPostProcessor a = new AutoCallableAnnotationPostProcessor();
//        List<Printer> all = a.findAutoCallable();
        PrinterHelper printerHelper = new PrinterHelper();
//        printerHelper.printAll();
//        Assertions.assertEquals(2, all.size());
    }



}