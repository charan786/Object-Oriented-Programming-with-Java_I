import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> info = new ArrayList<>();
        
        while(true){
            System.out.println("Title:");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Pages:");
            int pages= Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            
            info.add(new Book(name,pages,year));
            System.out.println(info);
            
            
        }
        System.out.print("What information will be printed?");
        String user = scanner.nextLine();
        if(user.equals("everything")){
            for(Book eachvalue: info){
                System.out.println(eachvalue);
            }
        }else if(user.equals("name")){
            for(Book eachvalue: info){
                System.out.println(eachvalue.getName());
            }
        }
        
        
       
      

    }
}
