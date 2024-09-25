package ru.mpei.LR1;

public class ArabicCalcs extends Calculations{

    public ArabicCalcs(String num1, String num2) {
        super(num1, num2);
    }


    @Override
    public void addition() {
        System.out.println(Integer.valueOf(getNum1())+Integer.valueOf(getNum2()));
    }

    @Override
    public void subtraction() {
        Double ans = Double.valueOf(getNum1()) - Double.valueOf(getNum2());
        if (ans <= 0){
            System.out.println("Неположительный результат");
        }else{
            System.out.println(ans);
        }
    }

    @Override
    public void multiplication() {
        System.out.println(Integer.valueOf(getNum1()) * Integer.valueOf(getNum2()));
    }

    @Override
    public void division() {
        Integer ans = (int) Math.floor(Double.valueOf(getNum1()) / Double.valueOf(getNum2()));
        System.out.println(ans);
    }
}
