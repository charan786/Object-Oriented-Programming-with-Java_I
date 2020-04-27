
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while(true){
            String name = leer.nextLine();
            if(name.equals("")){
                break;
            }else{
                String[] cut= name.split(" ");
                for(String divide:cut){
                    System.out.println(divide);
                }
                        
            }
                
            
        
        }
           
        
        


    }
}
