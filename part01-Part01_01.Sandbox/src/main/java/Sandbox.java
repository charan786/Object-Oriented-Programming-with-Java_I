import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Arrays;


public class Sandbox {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target =13;
        int[] num =printNum(numbers,target);
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(Arrays.toString(num));
      
    }   
    
    
   
    public static int[] printNum(int[] nums, int target){
        int first =0;
        int second =0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int complement = target-nums[i];
                if(j == complement){
                    first =i;
                    second =j;
                }
            }
        }
        int [] num={first,second};
        return num;
     
    }
    
        
}