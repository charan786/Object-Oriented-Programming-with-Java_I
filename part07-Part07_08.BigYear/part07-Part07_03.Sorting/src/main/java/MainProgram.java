import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {84, 23, 17, 9, 51, 232, 14};
        MainProgram.sort(numbers);
        
        

    }
    
    
    public static int smallest(int[] sort){
        int small = sort[0];
        for(int i=0;i<sort.length;i++){
            int chota = sort[i];
            if(chota<small){
                small = chota;
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] sort){
        int index =0;
        int small =smallest(sort);
        for(int i=0; i<sort.length;i++){
            int ea = sort[i];
            if(ea == small){
                index =i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] sort,int num){
        int index =0;
        int small=sort[num];
        for(int i=num;i<sort.length;i++){
            int chota = sort[i];
            if(chota<=small){
                small = chota;
                index =i;
            }
        }
        return index;

    }
    public static void swap(int[] array, int first, int second) {
        int swap = array[first];
        array[first]=array[second];
        array[second]=swap;
        
    }
    public static void sort(int[] array) {
        for(int i=0;i<array.length;i++){
            int ind=indexOfSmallestFrom(array,i);
            swap(array, ind,i);
            System.out.println(Arrays.toString(array));
        }

    }
    
  
     


}
