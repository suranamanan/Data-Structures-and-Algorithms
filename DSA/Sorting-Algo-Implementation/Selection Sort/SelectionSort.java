import java.io.*;
import java.util.*;

//review again

class SelectionSort{

    //Worst time complexity for a sorting algorithm possible 
    //O(n^2) 

    public static void main(String[] args){
        int[] nums = new int[] {1, 5, 6, 3, 10};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*

    Outer loop from left to right
    calc minvalue and minIndex

    Inner loop from i to the end
    
    if nums[j] < minValue, update minValue and minIndex

    if (nums[i] > minValue) replace nums[i] with nums[minIndex] or minValue

    
     */
    public static int[] sort(int[] nums){
        
        for(int i = 0; i < nums.length - 1; i++){
            int minIndex = i;
            int minValue = nums[i];

            //cannot use nums.length-1-i because sorted elements
            //are at the front
            for(int j = i; j < nums.length; j++){

                if(nums[j] < minValue){
                    minIndex = j;
                    minValue = nums[j];
                }

            }

            if(minValue < nums[i]){
                int temp = nums[i];
                nums[i] = minValue;
                nums[minIndex] = temp;
            }
        }


        return nums; 
    
    }


}