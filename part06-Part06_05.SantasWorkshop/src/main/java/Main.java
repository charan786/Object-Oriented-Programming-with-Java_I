public class Main {
    public static void main(String[] args) {
        
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift l1 = new Gift("bunny",2);
        Gift l2 = new Gift("teddy", 1);
        Gift l3 = new Gift("turnip", 4);

        Package count = new Package();
        count.addGift(book);
        count.addGift(l1);
        count.addGift(l2);
        count.addGift(l3);
        System.out.println(count.totalWeight());
        
        
        
    }
}