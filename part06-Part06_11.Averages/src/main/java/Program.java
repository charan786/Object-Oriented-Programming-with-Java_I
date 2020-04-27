
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);
        
        UserInterface really= new UserInterface(register,scanner);
        really.start();

        
        


    }
}
