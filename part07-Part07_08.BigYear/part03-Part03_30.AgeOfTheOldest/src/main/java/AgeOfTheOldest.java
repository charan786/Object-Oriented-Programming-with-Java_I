
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int age =0;
        while(true){
            String format = leer.nextLine();
            if(format.equals("")){
                break;
            }
            String[] cut = format.split(",");
            int i =0;
            if(age<Integer.valueOf(cut[1])){
                age=Integer.valueOf(cut[1]);
            }
            
            
        }
        System.out.println("Age of the oldest: "+age);
        
        
        
   
            
    }
        
        


    
}
