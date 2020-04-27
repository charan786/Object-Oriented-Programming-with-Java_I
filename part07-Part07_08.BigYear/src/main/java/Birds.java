/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Birds {
    private String name;
    private String latin;
    private int observation;
    
    public Birds(String x, String y){
        name = x;
        latin =y;
        observation=0;
    }
    
    public String getName(){
        return name;
    }
    public void observe(){
        observation+=1;
    }
    
    public String toString(){
        return name+" "+latin+": "+observation+" "+"observations";
    }
    
}

