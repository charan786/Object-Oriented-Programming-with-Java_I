import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> small = new ArrayList<>();
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            if(value == 9999){
                break;
            }
            small.add(value);
        }
        int chota= small.get(0);
        int i = 0;
        while(i<small.size()){
            if(chota>small.get(i)){
                chota=small.get(i);
            }
            i=i+1;
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        System.out.println("Smallest number: "+chota);
        int index =0;
        while(index<small.size()){
            if(chota == small.get(index)){
                System.out.println("Found at index: "+index);
            }
            index = index+1;
        }
    }
}
