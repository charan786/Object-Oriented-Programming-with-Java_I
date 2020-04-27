
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> third_value = new ArrayList<>();
        int i =1;
        while (true) {
            System.out.println("Enter the string "+i+" to the list");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            third_value.add(input);
            i = i+1;
        }

        System.out.println(third_value.get(2));
    }
}
