
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
public class Room {
    private ArrayList<Person> lust;
    
    public Room(){
        lust =new ArrayList<>();
    }
    public void add(Person person){
        this.lust.add(person);
    }
    public boolean isEmpty(){
        if(!(this.lust.isEmpty())){
            return false;
        }
        return true;
    }
    public ArrayList<Person> getPersons(){
        return this.lust;
    }
    public Person shortest(){
        
        if(this.lust.isEmpty()){
            return null;
        }
        Person lowest =this.lust.get(0);
        int small = lowest.getHeight();
        int i =0;
        
        while(i<this.lust.size()){
            Person eachObject = this.lust.get(i);
            if(eachObject.getHeight()<small){
                lowest = eachObject;
                small=eachObject.getHeight();
            }
            i=i+1;
        }
        return lowest;
    }
    
    public Person take(){
       if(this.lust.isEmpty()){
            return null;
        }
        Person lowest =shortest();
        this.lust.remove(lowest);
        return lowest;
        
    }
}
