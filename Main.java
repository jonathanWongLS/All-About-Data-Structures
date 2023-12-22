import java.util.Arrays;
import java.util.ArrayList;
import LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Array
        String[] array = new String[10];
        array[0] = "First";
        array[1] = "Second";
        array[4] = "Fourth";

        System.out.println(Arrays.toString(array));
        System.out.println(array[1]);

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // -> Add
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(3);
        System.out.println("After adding: " + arrayList);

        // -> Remove
        arrayList.remove(1);
        System.out.println("After removing index 1: " + arrayList);

        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.append(3);
        System.out.println(ll);
    }
}
