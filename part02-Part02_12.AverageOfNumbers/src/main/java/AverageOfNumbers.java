
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int avg =0;
        while(true){
            System.out.println("Give a number:");
            int value=Integer.valueOf(scanner.nextLine());
            if (value==0){
                break;
            }else{
                num = num+1;
                avg = avg+value;
            }
        }
        double result = (double)avg/(num);
        System.out.println("Average of the numbers: "+result);

    }
}
