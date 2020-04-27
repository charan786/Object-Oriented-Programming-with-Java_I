
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scan.nextLine();
        try(Scanner read = new Scanner(Paths.get(file))){
            while(read.hasNextLine()){
                String eachline = read.nextLine();
                
                String [] pieces = eachline.split(",");
                String name =pieces[0];
                Integer age = Integer.valueOf(pieces[1]);
                if(age == 1){
                   System.out.println(name+", "+"age: "+age+" year"); 
                }else{
                    System.out.println(name+", "+"age: "+age+" years"); 
                }
                
            }
        }catch(Exception e){
            System.out.println("This file "+file+" can't be read.");
        }

    }
}
