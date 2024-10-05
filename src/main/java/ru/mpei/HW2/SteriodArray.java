package ru.mpei.HW2;

public class SteriodArray {
    private String[] mas;

    public SteriodArray() {
        this.mas = new String[10];
        for (int i = 0; i < this.mas.length/2; i++){
            mas[i] = String.valueOf(i);
        }
        toString();
    }

    //добавить строку (true, если добавление успешно)
    public boolean add(String s) {
        int i = 0;
        while (i < mas.length){
            if (mas[i] == null){
                break;
            }else{
                i++;
            }
        }
        if (i == mas.length){
            System.out.println("Не возможно добавление элемента, расширьте массив");
            return false;
        }else{
            this.mas[i] = s;
            System.out.println("Массив после добавления строки: " + s);
            toString();
            return true;
        }

    }
    //удалить строку. (true - если, нашли такую и удалили)
    public boolean remove (String s){
        int i = 0;
        for (String str : mas){
            if (str.equals(s)){
                del(i);
                System.out.println("Массив после удаления по строке: " + s);
                toString();
                return true;
            }else{
                i++;
            }
        }
        return false;
    };

    // удалить по индексу. (true - если, строка была удалена)
    public boolean remove (int i){
        if (i <= mas.length && i >= 0){
            del(i);
            System.out.println("Массив после удаления по индексу: " + i);
            toString();
            return true;
        }else{
            return false;
        }
    };

    //получить строку по индексу
    public String get(int i){
        if (i <= mas.length){
            System.out.println("Ваш элемент по индексу "+ i + " является строка " + mas[i]);
            return mas[i];
        }else{
            System.out.println("Такого индекса нет");
            return "";
        }

    };
    @Override
    public String toString(){
        int i = 0;
        String str = "";
        while(i < mas.length){
            str += (mas[i] + " ");
            i++;
        }
        System.out.println(str);
        return str;
    }

//возвращает текущий реальный размер добавленных строк
    public int length(){
        int i = 0;
        while (i <= mas.length){
            if (mas[i] != null){
                i++;
            }else{
                break;
            }
        }
        return i;
    };
    public int maxLength(){
        int count = 0;
        int i = 0;
        for (String str : mas){
            if (mas[i] != null){
                String[] st = str.split("");
                if (count < st.length){
                    count = st.length;
                }
                i++;
            }
        }
        return count;
    };


    //смещение всех элементов на 1 к началу
    private String[] del(int i){
        if (i < mas.length){
            while (i < mas.length-1 && mas[i] != null){
                mas[i] = mas[i+1];
                i++;
            }
            mas[i] = null;
        }else{
            mas[i] = null;
        }
        return mas;
    }
}
