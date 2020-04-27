
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> allnumbers = new ArrayList<>();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        double sum =0;
        double num=0;
        
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            if(value == -1){
                break;
            }
            if(value >= 0 && value <=100 ){
                if(value>=50){
                    numbers.add(value);
                }
                sum += value;
                num += 1;
                allnumbers.add(value);
            }
        }
        
        if(num==0){
            System.out.println("Point average (all): "+0);
            System.out.println("Point average (passing): "+"-");
            System.out.println("Pass percentage: "+0);
        }else{
            System.out.println("Point average (all): "+sum/num);
            System.out.println("Point average (passing): "+AnalyseArray(numbers));
            System.out.println("Pass percentage: "+numbers.size()/num*100);
        }
        
        System.out.println("Grade distribution: ");
        System.out.print("5: ");
        grade(allnumbers,89,101);
        
        System.out.print("4: ");
        grade(allnumbers,79,90);
        
        System.out.print("3: ");
        grade(allnumbers,69,80);
        
        System.out.print("2: ");
        grade(allnumbers,59,70);
        
        System.out.print("1: ");
        grade(allnumbers,49,60);
        
        System.out.print("0: ");
        grade(allnumbers,0,50);
        
        
        
    }
    
    public static double AnalyseArray(ArrayList<Integer> array){
        int sum=0;
        if(array.size()>0){
            for(int i=0;i<array.size();i++){
                sum += array.get(i);
            }
            return sum/array.size();
        }
        return 0;
    }
    
    public static void grade(ArrayList<Integer> array, int x, int y){
        int num =0;
        for(int i=0;i<array.size();i++){
            int value = array.get(i);
            if(value>x && value<y){
                num=num+1;
            }
        }
        printStar(num);
        
        
        
    }
    public static void printStar(int x){
        for(int i=1;i<=x;i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    
      
}
