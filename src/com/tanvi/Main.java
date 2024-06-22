package com.tanvi;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();


        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(17);
        list.insertLast(4);
        list.insertPosition(49, 3);

        list.display();

    }
}
