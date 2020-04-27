
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int values = Integer.valueOf(scanner.nextLine());
            if (values == -1) {
                break;
            }

            numbers.add(values);
        }
        int memory =0;
        while(memory < numbers.size()){
            System.out.println(numbers.get(memory));
            memory= memory+1;
        }        

    }
}
