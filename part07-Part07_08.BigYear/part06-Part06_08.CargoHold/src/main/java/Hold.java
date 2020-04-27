
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
public class Hold {
    private int taxi;
    private ArrayList<Suitcase> iruka;
    
    public Hold(int holdy){
        this.iruka = new ArrayList<>();
        this.taxi = holdy;
    }
    
    public void addSuitcase(Suitcase suitcase){
         if (this.total() + suitcase.totalWeight() > this.taxi) {
            return;
        }
 
        this.iruka.add(suitcase);
        
    }
    
    public String toString(){
        int totalsuit = this.iruka.size();
        int sum=0;
        for(Suitcase eachweight: this.iruka){
            sum += eachweight.totalWeight();
        }
        return totalsuit+" suitcases "+"("+sum+" kg)";
    }
    
    
    public void printItems(){
        for(Suitcase each:this.iruka){
            each.printItems();
        }
    }
    
    public int total(){
        int sum =0;
        for(Suitcase eachItem:this.iruka){
            sum=sum+eachItem.totalWeight();
        }
        return sum;
    }
}
