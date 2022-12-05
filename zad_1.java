// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class zad_1 {

    public static void main(String[] args) {
        
        String str_1 = new String("Молебен");
        String str_2 = new String("О");
        String str_3 = new String("Коне");
        String str_4 = new String("Белом");
 
        LinkedList<String> rev = new LinkedList<>();
        rev.add(str_1);
        rev.add(str_2);
        rev.add(str_3);
        rev.add(str_4);
 
        System.out.println(rev);        
        rev_list(rev);
        System.out.println(rev);
    }

    private static LinkedList rev_list(LinkedList rev) {
        int count = rev.size();
        for (int i = count-1; i >= 0; i--) {
            rev.add(rev.get(i));           
        }
        for (int i = 0; i < count; i++) {
            rev.removeFirst();
        }
        return rev;
    }
}
