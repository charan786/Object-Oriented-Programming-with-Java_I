
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> lust = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            boolean fuck = true;
            
            if (lust.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                lust.add(book);
            }
            //System.out.println(lust.get(0).equals(book));

        }
        System.out.println("Thank you! Books added: " + lust.size());

        // NB! Don't alter the line below!
        
    }
}

           
            