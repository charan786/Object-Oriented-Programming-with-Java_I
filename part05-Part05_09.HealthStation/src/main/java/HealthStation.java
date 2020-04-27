
public class HealthStation {
    private int weigh;


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weigh++;
        return person.getWeight();
        
    }
    public void feed(Person person) {
        int x = person.getWeight();
        person.setWeight(x+1);
    }
    
    public int weighings(){
        return this.weigh;
    }
    
   
}
