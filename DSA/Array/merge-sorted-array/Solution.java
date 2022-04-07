// https://leetcode.com/problems/merge-sorted-array/submissions/

/* 
    Question: Given two array num1 and num2 in sorted order increasing,
    sort num1 and num2 into one array

    elements in num1 is m
    elements in num2 is n
    but size of num1 is m+n
    m to m+n-1 is 0's

    We have to do an inplace operation in nums1
    We cannot return a new array

    Brute Force:
    We will combine all elements from nums1 and nums2 into nums1 and sort after
    Add first, Sort After

    Solution1:
    We will copy values from nums1 into a new array called copy
    We will iterate over nums1 and compare values from copy and nums2

    Solution2: 

    Solution3: Solution 3 on leetcode 

        We can start looping from the end of the array
        Compare the greatest elements first
*/

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] copy = new int[m];
        
        for(int index = 0; index < m; index++){
            copy[index] = nums1[index]; 
        }
        
        int p1 = 0; 
        int p2 = 0;
        int index = 0;
        
        while(p1 < m && p2 < n){
            if(copy[p1] <= nums2[p2]){
                nums1[index++] = copy[p1++];
            }else{
                nums1[index++] = nums2[p2++]; 
            }
        }
        
        while(p1 < m){
            nums1[index++] = copy[p1++];
        }
        
        while(p2 < n){
            nums1[index++] = nums2[p2++];
        }    
    }
}




