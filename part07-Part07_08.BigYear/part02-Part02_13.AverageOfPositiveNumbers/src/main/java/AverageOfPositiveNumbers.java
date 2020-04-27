
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int post =0;
        int avg =0;
        while(true){
            //System.out.println("Give a number:");
            int value=Integer.valueOf(scanner.nextLine());
            if (value==0){
                break;
            }
            if(value>0){
                post = post+1;
                avg = avg+value;
            }
        }
        double result = (double)avg/(post);
        
        if (post == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(result);
        }


    }
}
