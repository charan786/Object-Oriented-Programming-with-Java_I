/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Book {
    private String au;
    private String na;
    private int pa;
    
    public Book(String author, String name, int pages){
        this.au = author;
        this.na = name;
        this.pa = pages;
    }
    
    public String getAuthor(){
         return this.au;
    }
    public String getName(){
        return this.na;
    }
    public int getPages(){
        return this.pa;
    }
    public String toString(){
        return this.au+", "+this.na+", "+this.pa+" pages";
    }
}
