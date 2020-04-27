
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("");
        System.out.println(records);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String eachLine = scan.nextLine();
                String[] pieces = eachLine.split(",");
                System.out.println(pieces);
                System.out.println("");
                System.out.println("");
                String name=pieces[0];
                int age= Integer.valueOf(pieces[1]);
                persons.add(new Person(name, age));
                System.out.println(persons);
            }
        }catch(Exception e){
            System.out.println("This file "+file+" can't be read.");
        }

        // Write here the code for reading from file
        // and printing the read records
        
        return persons;

    }
}
