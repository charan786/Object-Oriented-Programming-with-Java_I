
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int age =0;
        String name="";
        while(true){
            String format = leer.nextLine();
            if(format.equals("")){
                break;
            }
            String[] cut = format.split(",");
            if(age<Integer.valueOf(cut[1])){
                age=Integer.valueOf(cut[1]);
                name=cut[0];
            }
            
            
        }
        System.out.println("Name of the oldest: "+name);


    }
}
