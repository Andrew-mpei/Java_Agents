package ru.mpei.LR1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class Tests {

    private long ts;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void additionRoman() {

        RomanCalcs romanCalcs = new RomanCalcs("IV", "VIII");
        romanCalcs.addition();
        Assertions.assertEquals("XII", outputStreamCaptor.toString().trim());

    }

    @Test
    void subtractionRoman() {
        RomanCalcs romanCalcs = new RomanCalcs("VIII", "X");
        romanCalcs.subtraction();
        Assertions.assertNotNull(outputStreamCaptor.toString().trim());
    }

    @Test
    void multiplication() {
    }

    @Test
    void divisionRoman() {
        RomanCalcs romanCalcs = new RomanCalcs("VII", "II");
        romanCalcs.division();
        Assertions.assertEquals("III", outputStreamCaptor.toString().trim());
    }
    @Test
    void divisionArabicNull() {
        Assertions.assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ArabicCalcs arabicCalcs = new ArabicCalcs("6", "0");
                arabicCalcs.division();
            }
        });
    }

    @BeforeEach
    public void before(){
        ts = System.currentTimeMillis();
    }
    @AfterEach
    public void afterEach(){
        System.err.println("Test was executed for "+(System.currentTimeMillis() - ts));
    }
    @AfterAll
    public static void afterALl(){

    }
}