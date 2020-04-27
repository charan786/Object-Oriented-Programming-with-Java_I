
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(10,30);

    }
    public static void divisibleByThreeInRange(int beginning, int end){
        int i = beginning;
        int j = end;
        while(i <= j){
            if(i%3==0){
                System.out.println(i);
                i = i+1;
            }else{
                i=i+1;
                
            }
            
        }
    }

}
