

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;
        
        //System.out.println(Arrays.toString(array));
        
        
        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        int i =0;
        boolean yes = false;
        while(i<array.length){
            if(searching == array[i]){
                System.out.println(searching+" is at index "+i+".");
                yes = true;
                
                break;
            }
            i = i+1;
        }
        if(!yes){
            System.out.println(searching+" was not found.");
        }
        
        
        

        // Implement the search functionality here
    }

}
