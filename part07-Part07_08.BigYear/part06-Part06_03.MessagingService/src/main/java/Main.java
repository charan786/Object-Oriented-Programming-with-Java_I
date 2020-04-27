
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message uno = new Message("harry","numbers");
        Message dos = new Message("arjun","girls");
        Message tres = new Message("dale","wickets");
        System.out.println(uno);
        System.out.println(dos);
        System.out.println(tres);
        
        
        
        MessagingService ms = new MessagingService();
        ms.add(uno);
        ms.add(dos);
        ms.add(tres);
        
        System.out.println(ms.getMessages());
        
    }
}
