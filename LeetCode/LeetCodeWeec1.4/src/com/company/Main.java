package com.company;

public class Main {

    public static void main(String[] args) {
//
//        Input: [0,1,0,3,12]
//        Output: [1,3,12,0,0]


        int[] nums = {2,1};


        for (int num: nums
             ) {
            System.out.print(num + " ");
        }

        moveZeroes(nums);
        System.out.println(" ");

        for (int num: nums
        ) {
            System.out.print(num + " ");
        }


    }

    public static void moveZeroes(int[] nums) {

        int numsLegth = nums.length;
        int shafl = nums[0];

        for (int j = 0;j< numsLegth; j ++) {
            for (int i = 0; i < numsLegth - j; i++) {
                if (i == numsLegth - j - 1)
                    break;
                else if (nums[i] == 0) {
                    shafl = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = shafl;
                }
                else if (nums[i + 1] == 0) {
                    continue;
                }
                /*else if (nums[i] > nums[i + 1]) {
                    shafl = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = shafl;
                }*/
            }
        }




    }
}
