import java.io.*;
import java.util.*;

class BubbleSort{

    //Worst time complexity for a sorting algorithm possible 
    //O(n^2) 

    public static void main(String[] args){

        int[] nums = new int[] {1, 5, 6, 3, 10};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        

    }

    public static int[] sort(int[] nums){

        //We are "bubbling up" the biggest number to the end
        //We move large numbers to the right and small to the left
        
        for(int i = 0; i < nums.length - 1; i++){
            //i is equal to the number of elements you 
            //have sorted

            //in each iteration, the biggest number will be sorted

            //the biggest number will be pushed till the end in the first iter
            //the second biggest number will be pushed till the end in the first iter
            for(int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }


        return nums; 
    
    }


}