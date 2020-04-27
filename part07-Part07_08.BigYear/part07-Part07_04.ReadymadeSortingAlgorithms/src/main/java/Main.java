import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] numbers = {3, 1, 5, 99, 3, 12};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        String[] arrayOfStrings = {"detsu","cakashi", "Binato", "abito"};
        sort(arrayOfStrings);
        System.out.println(Arrays.toString(arrayOfStrings));
        
        ArrayList<Integer> jumbo = new ArrayList<>();
        jumbo.add(49);
        jumbo.add(20);
        jumbo.add(38);
        sortIntegers(jumbo);
        System.out.println(jumbo);
        
        ArrayList<String> dumbo = new ArrayList<>();
        dumbo.add("hello");
        dumbo.add("Cello");
        dumbo.add("tello");
        dumbo.add("bello");
        sortStrings(dumbo);
        System.out.println(dumbo);
        
        
        
    }
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}
