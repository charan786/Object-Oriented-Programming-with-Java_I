
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String name = "";
        int sum = 0;
        int count = 0;
        int length=0;
        while(true){
            String naam_birthday = leer.nextLine();
            if(naam_birthday.equals("")){
                break;
            }
            count=count+1;
            String[] divide = naam_birthday.split(",");
            sum=sum+Integer.valueOf(divide[1]);
            String naam = divide[0];
            int newlen = naam.length();
            if(length<newlen){
                length=newlen;
                name=naam;
            }
        }
        System.out.println("Longest name: "+name);
        
        double avg= (double)sum/count;
        System.out.println("Average of the birth years: "+avg);
        


    }
}
