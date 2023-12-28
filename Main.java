import java.util.Arrays;
import java.util.ArrayList;

import BinaryTrees.BinaryTree;
import Hashmap.Hashmap;
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
        ll.prepend(10);
        ll.prepend(11);
        System.out.println(ll);

        ll.insertAtIndex(0, 20);
        System.out.println(ll);
        ll.insertAtIndex(2, 21);
        System.out.println(ll);

        ll.insertAtIndex(4, 1000);
        System.out.println(ll);
        ll.insertAtIndex(5, 1001);
        System.out.println(ll);
        ll.insertAtIndex(7, 1001);
        System.out.println(ll);
//        ll.insertAtIndex(9, 1003);
//        System.out.println(ll);

        ll.deleteByValue(2);
        System.out.println(ll);
        ll.deleteAtIndex(2);
        System.out.println(ll);
        ll.deleteAtIndex(0);
        System.out.println(ll);
        ll.deleteAtIndex(5);
        System.out.println(ll);

        // HashMap
        Hashmap map = new Hashmap();
        map.hashmapMain();

        // Binary Tree
        BinaryTree btree = new BinaryTree();
        btree.root = new BinaryTree.Node(25);
        btree.insert(btree.root, 11);
        btree.insert(btree.root, 15);
        btree.insert(btree.root, 16);
        btree.insert(btree.root, 23);
        btree.insert(btree.root, 79);

        System.out.println(btree.preorder());
        System.out.println(btree.inorder());
        System.out.println(btree.postorder());
    }
}
