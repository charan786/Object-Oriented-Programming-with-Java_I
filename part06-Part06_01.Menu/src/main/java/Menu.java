
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    public void addMeal(String curry){
        if(!(this.meals.contains(curry))){
            this.meals.add(curry);
        }
        
    }
    
    public void printMeals(){
        for(String eachItem:this.meals){
            System.out.println(eachItem);
        }
    }
    public void clearMenu(){
        int i =0;
        while(i<this.meals.size()){
            this.meals.remove(i);
        }
        
    }

    // implement the required methods here
}
