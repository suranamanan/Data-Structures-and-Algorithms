/**

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.


Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    
Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    
Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]


Solution:

Brute Force:

- We will find all possible pairs and check their sum one at a time

this will take O(n^2) time complexity
and o(1) space complexity 

In this case we are saving space

But we can use space and reduce time,
and we usually want to optimize for time more than space

Hashmap:

We can make a hashmap where we can store each values and their index in the array

Our problem wants us to find two values whose sum is equal to target,
what we can do is take the difference betwee

 */



class Solution {
    
    
    public int[] twoSum(int[] nums, int target) {
        
    }
}
