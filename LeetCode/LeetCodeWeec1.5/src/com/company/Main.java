package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
//        Input: [7,1,5,3,6,4]
//        Output: 7
//        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
        int[] nums = {7,1,5,3,6,4};


        System.out.println(maxProfit(nums));
	// write your code here
    }

    public static int maxProfit(int[] prices) {

        int sumPrice = 0;

        for(int i = 0;i<prices.length; i++){
            if (i == prices.length - 1)
                break;
            if(prices[i] < prices[i +1])
                sumPrice += prices[i + 1] - prices[i];

        }
        return sumPrice;
    }
}
