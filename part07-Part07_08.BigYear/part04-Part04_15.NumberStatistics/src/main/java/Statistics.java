public class Statistics {
    private int count;
    private int sum;
   

    public Statistics() {
        this.count=0;
        this.sum=0;
    }

    public void addNumber(int number) {
        this.count=this.count+1;
        this.sum= this.sum+number;
    }

    public int getCount() {
        return this.count;
    }
    public int sum() {
        return this.sum;
    }

    public double average() {
        // write code here
        double avg= (double)this.sum/this.count;
        if(avg>0){
            return avg;
        }else{
            return 0;
        }
    }
}