
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean x = false;
        
        ArrayList<String> lines = new ArrayList<>();

// we create a scanner for reading the file
        try (Scanner read = new Scanner(Paths.get(file))) {

            while (read.hasNextLine()) {
                lines.add(read.nextLine());
            }
        }catch (Exception e) {
            System.out.println("Reading the file "+file+" failed.");
        }
        for(int i=0;i<lines.size();i++){
            if(searchedFor.equals(lines.get(i))){
                x=true;
                
            }
        }
        if(x == true ){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }
        

// we print the total number of lines
        

    }
}
