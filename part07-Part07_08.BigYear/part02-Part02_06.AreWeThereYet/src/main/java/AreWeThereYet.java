
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chance = 0;
        while (true){
            System.out.println("Give a number:");
            int value =Integer.valueOf(scanner.nextLine());
            if (value == 4){
                break;
            }
        }

    }
}
