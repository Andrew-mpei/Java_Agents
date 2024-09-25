package ru.mpei.LR1;

public class RomanCalcs extends Calculations{
    public RomanCalcs(String num1, String num2) {
        super(num1, num2);
    }

    @Override
    public void addition() {
        RomanCalcs r = new RomanCalcs(getNum1(), getNum2());
        Integer arabic1 = r.transInArabic(getNum1());
        Integer arabic2 = r.transInArabic(getNum2());
        Integer sum = arabic1 + arabic2;
        System.out.println(r.transInRoman(sum));
    }

    @Override
    public void subtraction() {
        RomanCalcs r = new RomanCalcs(getNum1(), getNum2());
        Integer arabic1 = r.transInArabic(getNum1());
        Integer arabic2 = r.transInArabic(getNum2());
        Integer sum = arabic1 - arabic2;
        if (sum <= 0){
            System.out.println("Неположительный результат");
        }else{
            System.out.println(r.transInRoman(sum));
        }

    }

    @Override
    public void multiplication() {
        RomanCalcs r = new RomanCalcs(getNum1(), getNum2());
        Integer arabic1 = r.transInArabic(getNum1());
        Integer arabic2 = r.transInArabic(getNum2());
        Integer sum = arabic1 * arabic2;
        System.out.println(r.transInRoman(sum));
    }

    @Override
    public void division() {
        RomanCalcs r = new RomanCalcs(getNum1(), getNum2());
        Integer arabic1 = r.transInArabic(getNum1());
        Integer arabic2 = r.transInArabic(getNum2());
        Integer sum = (int) Math.floor(Double.valueOf(arabic1) / Double.valueOf(arabic2));
        System.out.println(r.transInRoman(sum));

    }

    private Integer transInArabic(String num){
        String[] str = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        Integer numInt = 0;
        for (int i = 1; i <= 10; i++){
            if (str[i].equals(num)){
                numInt = i;
                break;
            }
        }
        return  numInt;
    }
    private String transInRoman(Integer num){
        String[] strEd = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] strTen = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        int i = 1;
        String result = "";
        while (i <= 10){
            if (num / 10 == i){
                result += strTen[i];
            } else{
            }
            i++;
        }
        i = 0;
        while(i <=10){
            if (num % 10 == i) {
                result += strEd[i];
            }
            i++;
        }
        return  result;
    }
}
