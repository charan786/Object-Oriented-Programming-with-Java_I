
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        while (true){
            String i = reader.nextLine();
            if(i.equals("end")){
                break;
            }
            int j = Integer.valueOf(i);
            int cube = j*j*j;
            System.out.println(cube);
        }

    }
}
