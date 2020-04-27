
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    public Money plus(Money addition) {
        
        int x = this.euros;
        int y = this.cents;
        
        int z = x+addition.euros();
        int a = y+addition.cents();
        
        Money newMoney = new Money(z,a); // create a new Money object that has the correct worth

    // return the new Money object
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        
        if(this.euros()<compared.euros() || this.euros() == compared.euros() && this.cents() < compared.cents()){
            return true;
        }
        return false;
    }
    public Money minus(Money decreaser){
        int x = this.euros;
        int y = this.cents;
        
        int z= x-decreaser.euros();
        int a= y-decreaser.cents();
        if(y==0){
            z = z-1;
            a = 100-decreaser.cents();
        }
        if(z<0){
            z=0;
            a=0;
        }
        
        Money newMoney = new Money(z,a); // create a new Money object that has the correct worth

    // return the new Money object
        return newMoney;
    }
    

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
