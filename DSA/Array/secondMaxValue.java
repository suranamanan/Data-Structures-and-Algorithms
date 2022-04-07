// Find Second Maximum Value in an Array
// int findSecondMaximum(int[] arr)
// arr = {9,2,3,6}

/**

    We dont need a second loop to find the second max 

    for(int index = 0; index < nums.length; index++){

    }

    int secondMaxValue = 

    for(){
        if(nums[index] != maxValue && nums[index] > secondMaxValue){

        }

    }

    we have access to the maxValue in the same loop

    also we will not update the secondmax only when we find a max
    because some numbers may not be bigger than the max but can be the
    second max

 */

 /*
    Subproblem is usually to find max or min, abstract the algo for that
    
  */

class secondMaxValue{

    public static int findSecondMax(int[] nums){

        //initialize to a max or min depending on the situation (if trying to max or min)
        int maxValue = Integer.MIN_VALUE; 
        int secondMax =  Integer.MIN_VALUE;

        for(int index = 0; index < nums.length; index++){
            if(nums[index] > maxValue){
                secondMax = maxValue; 
                maxValue = nums[index];
            }else if(nums[index] != maxValue && nums[index] > secondMaxValue){
                secondMax = nums[index];
            }

        }

        return secondMaxValue; 

    }


}

/**
    Unit test cases for problems
    What is the valid input set?

    Add some test cases like null or empty

    Test Cases:

    Most Obvious
    edge cases


    [1, 10, 100]
    [-1, -5, 0]
    [-1, -1, -1]
    [-1, -2, -10]
    [0, 0, 0]
 */