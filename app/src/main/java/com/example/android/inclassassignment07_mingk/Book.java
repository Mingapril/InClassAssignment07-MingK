package com.example.android.inclassassignment07_mingk;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String author;
    private boolean finishReading;
    private String genre;

    public Book(String bName,String bAuthor, boolean bFinishReading, String bGenre){
        this.name = bName;
        this.author = bAuthor;
        this.finishReading = bFinishReading;
        this.genre = bGenre;
    }

    public String getName() {
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public boolean getFinishReading(){
        return finishReading;
    }

    public String getGenre(){
        return genre;
    }

    public void setName(String name){
        this.name = name;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setFinishReading(boolean finishReading) {
        this.finishReading = finishReading;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}

