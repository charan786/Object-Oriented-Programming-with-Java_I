/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Gift {
    private String name;
    private int weight;
    
    public Gift(String peru, int wet){
        this.name = peru;
        this.weight = wet;
    }
    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }
    public String toString(){
        return this.name+"("+this.weight+" kg"+")";
    }
    
}
