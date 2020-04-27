
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while(true){
            String name = leer.nextLine();
            if(name.equals("")){
                break;
            }else{
                String [] corner = name.split(" ");
                int i = corner.length-1;
                System.out.println(corner[i]);
            }
        }


    }
}
