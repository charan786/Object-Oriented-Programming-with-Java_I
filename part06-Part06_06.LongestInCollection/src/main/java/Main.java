
public class Main {

    public static void main(String[] args) {


        // Try out your class here
        SimpleCollection c = new SimpleCollection("characters");
        System.out.println("Longest: " + c.longest());
        
        c.add("la");
        c.add("labs");
        c.add("lab");
        
        System.out.println("Longest: " + c.longest());

        
    }
}
