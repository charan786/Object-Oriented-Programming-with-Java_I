import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingASpecifiedFile{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String response = scan.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(response))){
                while(reader.hasNextLine()){
                    String row = reader.nextLine();
                    System.out.println(row);
                }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
                
        
    }
}