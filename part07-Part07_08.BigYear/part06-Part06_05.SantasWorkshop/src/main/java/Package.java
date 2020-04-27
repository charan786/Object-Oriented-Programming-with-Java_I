
import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gist;
    
    public Package(){
        this.gist = new ArrayList<>();
    } 
    public void addGift(Gift gift){
        this.gist.add(gift);
    }
    public int totalWeight(){
        int sum=0;
        int i =0;
        while(i<this.gist.size()){
            Gift returnObject = this.gist.get(i);
            sum = sum+returnObject.getWeight();
            i=i+1;
        }
        return sum;
   
        

     
   }
}
