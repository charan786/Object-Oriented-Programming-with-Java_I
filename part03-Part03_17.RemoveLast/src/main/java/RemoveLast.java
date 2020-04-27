
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();
       // strings.add("First");
       // strings.add("Second");
        //strings.add("Third");
        
        removeLast(strings);
        System.out.println(strings);
        

        
    }
    public static void removeLast(ArrayList<String> values){
        int last = values.size()-1;
        if(last>=0){
            values.remove(last);
        }
        
    }

}
