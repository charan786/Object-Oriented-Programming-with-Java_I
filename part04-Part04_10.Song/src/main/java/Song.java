/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Song {
    private String name;
    private int length;
    
    public Song(String intialname, int intiallength){
        this.name = intialname;
        this.length = intiallength;
    }
    public String name(){
        return this.name;
        //System.out.println(this.name);
    }
    public int length(){
        return this.length;
        //System.out.println(this.length);
    }
}
