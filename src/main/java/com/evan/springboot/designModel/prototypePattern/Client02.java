package com.evan.springboot.designModel.prototypePattern;

import java.util.ArrayList;

public class Client02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1=new Book();
        book1.setTitle("book111");
        ArrayList<String> arrayList = new ArrayList<>(3);
        //arrayList.add("111");

        book1.addImg("111");
        //book.showBook();

        Book book2=book1.clone();
        //book1.showBook();
        ArrayList<String> arrayList2 = new ArrayList<>(3);
        arrayList2.add("22222");
        book2.addImg("book2222");
        //book2.setImage(arrayList2);
        System.out.println(book1);
        System.out.println(book2);
        book1.showBook();
        book2.showBook();

    }
}
