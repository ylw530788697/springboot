package com.evan.springboot.designModel.prototypePattern;

import java.util.ArrayList;

public class Book implements Cloneable {
    private String title;

    private ArrayList<String> image=new ArrayList<String>(5);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getImage() {
        return image;
    }

    public void setImage(ArrayList<String> image) {
        this.image = image;
    }

    public void addImg(String imgName){
        image.add(imgName);
    }

    public  Book(){
        super();
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        Book book = (Book) super.clone();
        book.image=(ArrayList<String>) this.image.clone();
        return book;
    }

    public void showBook(){
        System.out.println("----------------start--------------");

        System.out.println("title:"+title);
        for (String img:image) {
            System.out.println("image name:"+img);
        }

        System.out.println("----------------End-----------------");

        System.out.println();
    }

}
