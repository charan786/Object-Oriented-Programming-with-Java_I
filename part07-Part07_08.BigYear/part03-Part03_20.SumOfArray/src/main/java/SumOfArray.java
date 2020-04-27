
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {15, 21, 32, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int i =0;
        int sum =0;
        while(i<array.length){
            System.out.println(array[i]);
            sum = sum+array[i];
            i = i+1;
        }
        return sum;
    }
}
