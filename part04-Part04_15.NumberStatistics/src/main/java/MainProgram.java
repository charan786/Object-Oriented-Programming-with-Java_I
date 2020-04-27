
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        
  

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        //Statistics statistics = new Statistics();
        Statistics summation = new Statistics();
        Statistics evensum = new Statistics();
        Statistics oddsum = new Statistics();
        
        //statistics.addNumber(3);
        //statistics.addNumber(5);
        //statistics.addNumber(1);
        //statistics.addNumber(2);
        
        System.out.println("Enter numbers:");
        while(true){
            int value = Integer.valueOf(scan.nextLine());
            if(value == -1){
                break;
            }else{
                summation.addNumber(value);
                if(value%2==0){
                    evensum.addNumber(value);
                }else{
                     oddsum.addNumber(value);
                }
            }
        }
        
        
        
        
        
        //System.out.println("Count: " + statistics.getCount());
        //System.out.println("Sum: " + statistics.sum());
        //System.out.println("Average: " + statistics.average());
        System.out.println("Sum: " + summation.sum());
        System.out.println("Sum of even numbers: "+ evensum.sum());
        System.out.println("Sum of odd numbers: "+oddsum.sum());
       
        
        
        

        
        
    }
}
