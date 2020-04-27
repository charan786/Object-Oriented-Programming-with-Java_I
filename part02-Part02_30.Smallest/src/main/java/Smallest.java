
public class Smallest {

    public static int smallest(int number1, int number2) {
        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method
        while(true){
            if (number1 > number2){
                int con1 = number2;
                return con1;
               
            }else if(number1 < number2){
                int con2 = number1;
                return con2;
            }
        }
        
    }

    public static void main(String[] args) {
        int result = smallest(10, 292);
        System.out.println("Smallest: " + result);
    }
}
