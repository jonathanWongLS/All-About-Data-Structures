package Heaps;

import java.util.ArrayList;

public class MinHeap {
    public int length;
    private ArrayList<Integer> data;

    public MinHeap() {
        this.data = new ArrayList<>();
        this.length = 0;
    }

    public void insert(int value) {
        this.data.set(this.length, value);
        this.heapifyUp(this.length);
        this.length++;
    }

    public int delete() {
        if (this.length == 0) {
            return -1;
        }

        int out = this.data.getFirst();
        this.length--;

        if (this.length == 0) {
            this.data = new ArrayList<>();
            return out;
        }

        this.data.set(0, this.data.get(this.length));
        this.heapifyDown(0);
        return out;
    }

    private void heapifyDown(int index) {
        int leftIndex = this.leftChild(index);
        int rightIndex = this.rightChild(index);

        if (index >= this.length || leftIndex >= this.length) {
            return;
        }

        int lV = this.data.get(leftIndex);
        int rV = this.data.get(rightIndex);
        int v = this.data.get(index);

        if (lV > rV && v > rV) {
            this.data.set(index, rV);
            this.data.set(rightIndex, v);
            this.heapifyDown(rightIndex);
        }
        else if (rV > lV && v > lV) {
            this.data.set(index, lV);
            this.data.set(leftIndex, v);
            this.heapifyDown(leftIndex);
        }

    }

    private void heapifyUp(int index) {
        if (index == 0) {
            return;
        }

        int p = this.parent(index);
        int parentV = this.data.get(p);
        int v = this.data.get(index);

        if (parentV > v) {
            this.data.set(index, parentV);
            this.data.set(p, v);
            this.heapifyUp(p);
        }
    }

    private int parent(int index) {
        return (int)Math.floor((double) (index - 1) /2);
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }private int rightChild(int index) {
        return index * 2 + 2;
    }
}
