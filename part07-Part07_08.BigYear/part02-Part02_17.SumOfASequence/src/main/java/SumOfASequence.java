
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Last number?");
        int num = Integer.valueOf(read.nextLine());
        int i =1;
        int sum =0;
        while(i<= num){
            sum= sum+i;
            i+=1;
        }
        System.out.println("The sum is "+sum);
       

    }
}
