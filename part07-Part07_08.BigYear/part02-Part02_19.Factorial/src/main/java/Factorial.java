
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int value = Integer.valueOf(scanner.nextLine());
        int zero = 1;
        if (value == 0){
            System.out.println("Factorial: "+zero);
        }else{
            for(int i = value; i >= 2; i--){
                value = value*(i-1);
            }
            System.out.println("Factorial: "+value);
        }
    }
}
