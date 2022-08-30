package task2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(20);

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            Integer tmp = listIterator.next();
            System.out.println(tmp);
        }

    }
}
