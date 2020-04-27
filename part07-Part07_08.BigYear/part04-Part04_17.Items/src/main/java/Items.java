
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Name:");
            String value = scanner.nextLine();
            if(value.isEmpty()){
                break;
            }else{
                items.add(new Item(value));
            }
        }
        for(Item num:items){
            System.out.println(num);
        }
                

    }
}
