package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here Explanation: [4,-1,2,1] has the largest sum = 6.
        int[] nums = {-2,1,-3,4,-1,2,1,-5,9};

        int[] nums2 = {-3,-2,0,-1};


        System.out.println(isHappy(nums));
    }

    static public int isHappy(int [] nums) {


        int numSum = 0;
        int numFinal = nums[0];

        for (int i = 0; i < nums.length; i++) {
            numSum += nums[i];

            if(i == nums.length-1) {
                if(numFinal < numSum)
                    numFinal = numSum;
                break;
            }
            if(numFinal < numSum)
                numFinal = numSum;
            if ((numSum + nums[i+1]) < nums[i+1]) {
                numSum = 0;
            }

        }

        return numFinal;

    }

}
