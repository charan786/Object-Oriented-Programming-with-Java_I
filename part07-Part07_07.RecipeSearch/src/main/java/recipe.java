import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class recipe {
    private String name;
    private String time;
    private ArrayList<String> ingredients;
    
    public recipe(String name,String time){
        this.name=name;
        this.time=time;
        this.ingredients = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    public int getTime(){
        return Integer.parseInt(time);
    }
    public void add(String name){
        ingredients.add(name);
    }
    public int listSize(){
        return ingredients.size();
    }
    
    
    public boolean check(String same){
        if(ingredients.contains(same)){
            return true;
        }
        return false;
    }
    public String toString(){
        return getName()+", "+"cooking time: "+getTime();
    }
}
