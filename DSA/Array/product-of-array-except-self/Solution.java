// https://leetcode.com/problems/product-of-array-except-self/submissions/

/*
    We are given an array nums, and we want to return an int[] result 
    such that each index contains product of all elements except self 
    

    Brute force:
    
    We will loop through the array and calculate the product as we go through each index

    We will loop through the array again and divide the product of the whole array with
    num at the current index 

    
    Solution 1:

    Calculate an array left, which has the product of all elements to the left

        -Make an array of size of nums
        -Loop through left array, from 0
        -if index = 0, put 1 and continue
        left[index] = left[index-1] * nums[index-1]

    Calculate an array right, which has the product of all elements to the right
        -Make an array of size of nums
        -Loop through right array, from the end 
        -if index = nums.length - 1, put 1 and continue
        right[index] = left[index+1] * nums[index+1]

    Solution 2:

    in 0(1) space 
 */


class Solution {

    public int[] productExceptSelf(int[] nums) {
        
        int size = nums.length;
        
        int[] left = new int[size];
        int[] right = new int[size];
        
        
        for(int index = 0; index < size; index++){
            if(index == 0){
                left[index] = 1;
                continue; 
            }
            left[index] = left[index-1] * nums[index - 1]; 
        }
        
        for(int index = size-1; index >= 0; index--){
            if(index == size-1){
                right[index] = 1;
                continue; 
            }
            
            right[index] = right[index+1] * nums[index+1]; 
            
        }
        
        int[] result = new int[size];
        
        for(int index = 0; index < size; index++){
            result[index] = left[index] * right[index];
        }
        
        return result; 
        
        
    }
}