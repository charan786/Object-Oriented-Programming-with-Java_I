
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String>names = new ArrayList<>();
        
        while(true){
            String store = reader.nextLine();
            if(store.equals("end")){
                break;
            }
            names.add(store);
            
        }
        int i = names.size();
        System.out.println(i);

    }
}
