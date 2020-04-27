
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int star = 1;
        while(star<= number){
            System.out.print("*");
            star = star+1;
            
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i =0;
        while(i < number){
            System.out.print(" ");
            i+=1;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i =1;
        while(i <= size){
            printSpaces(size-i);
            printStars(i);
            i+=1;
            

        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i =1;
        while(i <= height){
            printSpaces(height-i);
            printStars(i+i-1);
            i+=1;
            
        }
        for(int x=1;x<3;x++){
            printSpaces(height-2);
            printStars(3);
            
            
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
