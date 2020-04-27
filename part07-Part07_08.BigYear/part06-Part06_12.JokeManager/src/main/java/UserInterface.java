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
public class UserInterface {
    private JokeManager x;
    private Scanner y;
    
    public UserInterface(JokeManager re,Scanner si){
        x=re;
        y=si;
    }
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String input = y.nextLine();
            if(input.equals("X")){
                break;
            }else if(input.equals("1")){
                String joke = y.nextLine();
                x.addJoke(joke);
            }else if(input.equals("2")){
                x.drawJoke();
            }else if(input.equals("3")){
                x.printJokes();
            }
        }    
    }
}
