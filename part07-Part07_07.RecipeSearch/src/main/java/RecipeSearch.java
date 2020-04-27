
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<recipe> objects = new ArrayList<>();
        
        
        System.out.print("File to read:");
        String response = scanner.nextLine();
        System.out.println("");
        
        try (Scanner reader = new Scanner(Paths.get(response))){
                while(reader.hasNextLine()){
                    
                    String name = reader.nextLine();
                    String time= reader.nextLine();
                    recipe x = new recipe(name,time);
                    while(reader.hasNextLine()){
                        String eachLine =reader.nextLine();
                        if (eachLine.isEmpty()) {
                            break;
                        }
                        x.add(eachLine);
                    }
                    objects.add(x);
                 
                }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            //System.exit(0);
        }
        
        
        
        
        
        while(true){
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");
            System.out.print("Enter command:");
            String res = scanner.nextLine();
            System.out.println("");
        
            if (res.equals("list")) {
                System.out.println("Recipes:");
                printName(objects);
                System.out.println("");
            } else if (res.equals("stop")) {
                //System.exit(0);
                break;
            } else if(res.equals("find name")){
                System.out.print("Searched word:");
                String name =scanner.nextLine();
                Search(objects,name);
                
            }else if (res.equals("find cooking time")){
                System.out.print("Max cooking time:");
                String tame = scanner.nextLine();
                Time(objects,tame);
            }else if(res.equals("find ingredient")){
                System.out.print("Ingredient:");
                String item = scanner.nextLine();
                chick(objects,item);
                
            }
        }
        
        
    }
    public static void printName(ArrayList<recipe>lust) {
        for(int i=0;i<lust.size();i++){
            recipe x= lust.get(i);
            
            System.out.println(x);
        }
            
    }
    public static void Search(ArrayList<recipe>lust,String y){
        for(int i=0;i<lust.size();i++){
            recipe x= lust.get(i);
            if(x.getName().contains(y)){
                System.out.println(x);
            }
        }
    }
    public static void Time(ArrayList<recipe>lust,String y){
        for(int i=0;i<lust.size();i++){
            recipe x= lust.get(i);
            if(x.getTime()<=Integer.parseInt(y)){
                System.out.println(x);
            }
        }
    }
    public static void chick(ArrayList<recipe>lust,String y){
        for(int i=0;i<lust.size();i++){
            recipe x= lust.get(i);
            if(x.check(y)){
                System.out.println(x);
            }
        }
    }
    
    
    
        

}
//recipes.txt
//list
