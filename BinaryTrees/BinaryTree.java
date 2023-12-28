package BinaryTrees;

import java.util.ArrayList;

public class BinaryTree {
    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;
    public int height;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            }
            else {
                System.out.println("Inserted " + value + " to left of Node " + node.value);
                node.left = new Node(value);
            }
        }
        else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            }
            else {
                System.out.println("Inserted " + value + " to right of Node " + node.value);
                node.right = new Node(value);
            }
        }
    }
    public ArrayList<Integer> walkPreorder(Node curr, ArrayList<Integer> path) {
        if (curr == null) {
            return path;
        }

        // Recurse
        // Pre
        path.add(curr.value);

        // Recurse
        walkPreorder(curr.left, path);
        walkPreorder(curr.right, path);

        // Post
        return path;
    }

    // Root is the first printed value
    public ArrayList<Integer> preorder() {
        ArrayList<Integer> path = new ArrayList<>();
        walkPreorder(this.root, path);

        return path;
    }

    public ArrayList<Integer> walkInorder(Node curr, ArrayList<Integer> path) {
        if (curr == null) {
            return path;
        }

        // Recurse
        // Pre

        // Recurse
        walkPreorder(curr.left, path);
        path.add(curr.value);
        walkPreorder(curr.right, path);

        // Post
        return path;
    }

    // Root is the middle value
    public ArrayList<Integer> inorder() {
        ArrayList<Integer> path = new ArrayList<>();
        walkInorder(this.root, path);

        return path;
    }

    // Root is the last printed value
    public ArrayList<Integer> walkPostorder(Node curr, ArrayList<Integer> path) {
        if (curr == null) {
            return path;
        }

        // Recurse
        // Pre

        // Recurse
        walkPreorder(curr.left, path);
        walkPreorder(curr.right, path);
        path.add(curr.value);

        // Post
        return path;
    }

    public ArrayList<Integer> postorder() {
        ArrayList<Integer> path = new ArrayList<>();
        walkPostorder(this.root, path);

        return path;
    }
}
