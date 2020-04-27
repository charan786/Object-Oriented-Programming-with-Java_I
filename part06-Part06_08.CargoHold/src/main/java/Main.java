public class Main {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        Item mac = new Item("Macbook",8);

        Suitcase adasCase = new Suitcase(10);
        Suitcase pekkasCase = new Suitcase(10);
        Suitcase laps = new Suitcase(10);
        
        
        adasCase.addItem(book);
        adasCase.addItem(phone);
        pekkasCase.addItem(brick);
        laps.addItem(mac);

        Hold hold = new Hold(1000);
        
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
        hold.addSuitcase(laps);

        System.out.println(hold);
    }
}