
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter no1 = new Counter(2);
        no1.decrease(2);
        no1.increase(3);
        no1.increase(3);
        no1.increase(3);
        System.out.println(no1);
    }
}
