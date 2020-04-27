
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while(true){
            String sent = leer.nextLine();
            if(sent.equals("")){
                break;
            }else{
                String [] divide = sent.split(" ");
                System.out.println(divide[0]);
            }
        }
        


    }
}
