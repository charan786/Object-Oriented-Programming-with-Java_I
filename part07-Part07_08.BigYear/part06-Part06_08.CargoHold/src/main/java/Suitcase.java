
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
public class Suitcase {
    private ArrayList<Item> lust;
    private int max;
    
    
    public Suitcase(int max){
        this.max = max;
        lust =new ArrayList<>();
    }
    public void addItem(Item item){
        if (this.totalWeight() + item.getWeight() > this.max) {
            return;
        }
 
        this.lust.add(item);
    }
    
    
    
    public String toString(){
        
        if(lust.isEmpty()){
            return "no items (0 kg)";
        }
        if (this.lust.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
        
        int sum=totalWeight();
        return lust.size()+" items "+"("+sum+" kg)";
    }
    
    public void printItems(){
        for(int i=0; i<this.lust.size();i++){
            Item ohman = this.lust.get(i);
            System.out.println(ohman);
        }
    }
    public int totalWeight(){
        int sum =0;
        for(Item eachItem:this.lust){
            sum=sum+eachItem.getWeight();
        }
        return sum;
    }
    
    public Item heaviestItem(){
        
        if(this.lust.isEmpty()){
            return null;
        }
        
        
        Item heavy = this.lust.get(0);
        int great =heavy.getWeight();
        
        for(int i=0;i<this.lust.size();i++){
            Item saxo = this.lust.get(i);
            if(saxo.getWeight()>great){
                heavy =saxo;
                great=saxo.getWeight();
            }
        }
        return heavy;
    }
    
    
    
}
