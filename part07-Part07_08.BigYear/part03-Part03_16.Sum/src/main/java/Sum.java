
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(2);
        values.add(-2);
        values.add(3);
        
        System.out.println(sum(values));
        
    }
    public static int sum(ArrayList<Integer> numbers){
        int sum =0;
        for(Integer num:numbers){
            sum=sum+num;
            
        }
        return sum;
    }

}
