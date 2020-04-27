
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
    public String longest(){
        
        if(this.elements.isEmpty()){
            return null;
        }
        
        String longest = this.elements.get(0);
        int great = longest.length();
        
        int i =0;
        while(i<this.elements.size()){
            String lame = this.elements.get(i);
            if(great<lame.length()){
                longest = lame;
                great=lame.length();
            }
            i=i+1;
        }
        return longest;
        
    }

}
