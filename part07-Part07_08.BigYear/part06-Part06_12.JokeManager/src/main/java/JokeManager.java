 
import java.util.ArrayList;
import java.util.Random;
 
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author charan
 */
public class JokeManager {
    private ArrayList <String> last;
    
    
    
    public JokeManager(){
        last = new ArrayList<>();
        
    }
    public void addJoke(String joke){
        last.add(joke);
    }
    public String drawJoke(){
        if(last.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(last.size());
        System.out.println(last.get(index));
        return last.get(index);
        
        
    }
    public void printJokes(){
        for(int i =0;i<last.size();i++){
            System.out.println(last.get(i));
        }
    }
}