
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer>numbers = new ArrayList<>();
        while(true){
            int value=Integer.valueOf(scanner.nextLine());
            if(value == -1){
                break;
            }
            numbers.add(value);
        }
        
        int sum =0;
        int count= 0;
        for(Integer num: numbers ){
            sum=sum+num;
            count = count+1;
        }
        
        double avg = (double)sum/count;
        System.out.println(avg);
           
        
        
    }
}
