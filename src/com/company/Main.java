package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();

        bt.add(10);
        bt.add(5);
        bt.add(7);
        bt.add(14);
        bt.add(12);
        bt.add(17);
        bt.add(15);
        bt.add(1);

        System.out.println(bt);

    }
}

