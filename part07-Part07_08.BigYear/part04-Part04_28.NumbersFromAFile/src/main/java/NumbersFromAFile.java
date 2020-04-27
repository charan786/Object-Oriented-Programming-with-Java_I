
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int i =0;
        int j=0;
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                numbers.add(Integer.valueOf(reader.nextLine()));
            }
            
        }catch (Exception e){
            System.out.println("Give the correct file name.");
        }
        while(i<numbers.size()){
            if(lowerBound<=numbers.get(i) && numbers.get(i)<=upperBound){
                j=j+1;
            }
            i=i+1;
        }
        System.out.println("Numbers: "+j);

    }

}
