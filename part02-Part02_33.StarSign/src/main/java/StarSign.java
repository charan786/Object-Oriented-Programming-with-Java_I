
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(10, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }
    

    public static void printStars(int number) {
        // first part of the exercise
        int star = 1;
        while(star<= number){
            System.out.print("*");
            star = star+1;
            
        }
        System.out.println("");
        
        
    }

    public static void printSquare(int size) {
        // second part of the exercise
        
        int sqaure = 1;
        while(sqaure<= size){
            printStars(size);
            sqaure =sqaure+1;
            
            
        }
        
         
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int cbd =1;
        while(cbd <= height){
            printStars(width);
            cbd = cbd+1;
            
            
        }
        
        
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int triangle =1 ;
        while(triangle <= size){
            printStars(triangle);
            triangle = triangle+1;
            
        }
    }
}
