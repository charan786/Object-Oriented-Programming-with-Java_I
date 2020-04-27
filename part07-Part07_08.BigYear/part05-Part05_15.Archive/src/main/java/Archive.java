/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Archive {
    private String id;
    private String na;
    
    public Archive(String i, String n){
        this.id = i;
        this.na=n;
    }
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Archive)){
            return false;
        }
        Archive hell = (Archive) compared;
        return this.id.equals(hell.id);
    }
    public String toString(){
        return this.id+": "+this.na;
    }
    
    
}
