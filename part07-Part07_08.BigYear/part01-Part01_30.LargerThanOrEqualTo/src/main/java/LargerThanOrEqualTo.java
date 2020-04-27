
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int value1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(scanner.nextLine());
        
        if(value1 > value2){
            System.out.println("Larger number is: "+value1);
        }else if(value1<value2){
            
            System.out.println("Larger number is: "+value2);
        }else{
            System.out.println("The numbers are equal!");
        }
        
            
        
        
        
        

    }
}
