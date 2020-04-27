
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Birds> hello = new ArrayList<>();
        
        
        while(true){
            System.out.print("? ");
            String res = scan.nextLine();
            if(res.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();
                Birds pakshi = new Birds(name,latin);
                hello.add(pakshi);
               
                
                
            }else if(res.equals("Observation")){
                System.out.print("Bird? ");
                String item = scan.nextLine();
                for(int i=0;i<hello.size();i++){
                    Birds a = hello.get(i);
                    if(a.getName().equals(item)){
                        a.observe();
                    }
                }
                
            }else if(res.equals("All")){
                for(int i=0;i<hello.size();i++){
                    Birds b = hello.get(i);
                    System.out.println(b);
                }
            }else if(res.equals("Quit")){
                break;
            }else if(res.equals("One")){
                System.out.print("Bird? ");
                String hell = scan.nextLine();
                for(int i=0;i<hello.size();i++){
                    Birds a = hello.get(i);
                    if(a.getName().equals(hell)){
                        System.out.println(a);
                    }
                }
                
            }
        }

    }

}
