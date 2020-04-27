
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class TextUI {
    private SimpleDictionary di;
    private Scanner read;
    
    public TextUI(Scanner run,SimpleDictionary para){
        di = para;
        read = run; 
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String user = read.nextLine();
            if(user.equals("end")){
                break;
            }
            processInput(user);
            
            
        }
        System.out.println("Bye bye!");
    }
    public void processInput(String wtf){
        if(wtf.equals("add")){
            add();
        }else if(wtf.equals("search")){
            search();
        }else{
            System.out.println("Unknown command");
        }
    }
    
    public void add(){
        System.out.print("Word: ");
        String name=read.nextLine();
        System.out.print("Translation: ");
        String trans =read.nextLine();
        di.add(name,trans);
    }
    
    public void search(){
        System.out.print("To be translated: ");
        String searchTerm = read.nextLine();
        
        if(di.translate(searchTerm) == null){
            System.out.println("Word "+searchTerm +" was not found");
        }else{
            System.out.println("Translation: "+di.translate(searchTerm));
        }
        
    }
}
