
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
public class Stack {
    private ArrayList<String> cool;
    
    public Stack(){
        this.cool = new ArrayList<>(); 
    }
    
    public boolean isEmpty(){
        if(this.cool.isEmpty()){
            return true;
        }
        return false;
    }
    public void add(String value){
        if(!(this.cool.contains(value))){
            this.cool.add(value);
        }
    }
    public ArrayList<String> values(){
        ArrayList<String> what = this.cool;
        return what;
    }
    public String take(){
        int i = this.cool.size();
        String name = this.cool.get(i-1);
        this.cool.remove(name);
        
        return name;
    }
}
