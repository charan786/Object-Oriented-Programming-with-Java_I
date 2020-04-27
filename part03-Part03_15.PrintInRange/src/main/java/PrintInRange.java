
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(-1);
        list.add(5);
        list.add(1);
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(list,0,5);
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(list,3,10);
        
    }
    public static void printNumbersInRange(ArrayList<Integer> x, int low,int high){
        for(Integer number: x){
            if(number>=low && number<=high){
                System.out.println(number);
            }
        }
    }
    
}
