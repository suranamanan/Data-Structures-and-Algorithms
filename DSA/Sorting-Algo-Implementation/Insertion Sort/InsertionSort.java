import java.util.*;

class InsertionSort{

    //Worst time complexity for a sorting algorithm possible 
    //O(n^2) 

    /*
        Loop through array starting at index 1 
        (We compare i and i-1 we will have index out of bounds for i = 0)

        We have another loop 
        starting at the element we are on we move it back until it is > than i-1
     */

     /**
        We cannot use a double for loop to implement this sorting algo 
        i is fixed for the second loop but the value of nums[i] has been changed
      */

    public static void main(String[] args){

        int[] nums = new int[] {1, 5, 6, 3, 10};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }


    //static means we can use the method without making an object
    public static int[] sort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i - 1;

            //watch the part of the vide where he explains this again 
            //we keep on switching numbers till key is smaller than all the 
            //other elements
            //we do not use the key in the switch process
            while(j >= 0 && key < nums[j]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp; 
                j--;
            }
        }

        return nums;
    }


}