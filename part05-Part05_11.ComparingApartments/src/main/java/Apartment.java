
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquare(){
        return this.squares;
    }
    public int paisal(){
        return this.squares * this.princePerSquare;
        
    }
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.getSquare()){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        int sum = paisal()-compared.paisal();
        return Math.abs(sum);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(paisal()>compared.paisal()){
            return true;
        }
        return false;
    }
    

}
