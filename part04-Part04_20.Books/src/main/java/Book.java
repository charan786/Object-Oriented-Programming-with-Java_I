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
    private String title;
    private int pages;
    private int year;
    
    public Book(String name, int pa, int ye){
        this.title = name;
        this.pages = pa;
        this.year = ye;
    }
    
    public String getName(){
        return this.title;
    }
    public int getPages(){
        return this.pages;
    }
    public int getYear(){
        return this.year;
    }
    
    public String toString(){
        return this.title+", "+this.pages+" pages"+", "+this.year;
    }
            
}
