
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        
        if(this.elements.isEmpty()){
            return "The collection "+this.name+ " is empty.";
        }
        
        String eachItem ="";
        int i =0;
        while(i<this.elements.size()){
            eachItem = eachItem+this.elements.get(i)+"\n";
            i = i+1;
        }
        
        int j = this.elements.size();
        if(j==1){
            return "The collection "+this.name+" has "+j+" element:"+"\n"+this.elements.get(0);
        }
        return "The collection "+this.name+" has "+j+" elements:"+"\n"+eachItem;

        
    }
        
       
}
