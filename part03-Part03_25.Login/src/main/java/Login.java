
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String user1 = "alex";
        String password1 ="sunshine";
        String user2 = "emma";
        String password2 ="haskell";
        
        System.out.print("Enter username: ");
        String name = reader.nextLine();
        
        System.out.print("Enter password: ");
        String password = reader.nextLine();
        
        
        if(name.equals(user1)){
            
            if(password.equals(password1)){
                System.out.println("You have successfully logged in!");
            }else{
                System.out.println("Incorrect username or password!");
            }
        }else if(name.equals(user2)){
            if(password.equals(password2)){
                System.out.println("You have successfully logged in!");
            }else{
                System.out.println("Incorrect username or password!");
            }
        }else{
            System.out.println("Incorrect username or password!");
        }
    }
}
