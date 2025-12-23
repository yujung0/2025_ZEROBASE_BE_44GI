package Part2;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

        list.add(3, "4");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove("1");
        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " , ");
        }

        System.out.println();

        list.clear();
        System.out.println(list);

    }
}
