package com.company;

public class Main {

    private int num;

    public static void main(String[] args) {

        int num = 8664;

        System.out.println(isHappy(num));
        /*System.out.println(num);

        System.out.println((int)Math.log10(num)+1);

*/





    }


    static public boolean isHappy(int n) {

        int num = n;
        int num2 = 0;

        while (num != 1) {
            int countNum = (int) Math.log10(num) + 1;

            for (int i = 0; i < countNum; i++) {
                int x = num % 10;
                num2 += x * x;
                num = num / 10;
            }
            //System.out.println(num2);
            num = num2;
            num2 = 0;
            if (num == 4)
                return false;
        }

        return true;
    }



}
