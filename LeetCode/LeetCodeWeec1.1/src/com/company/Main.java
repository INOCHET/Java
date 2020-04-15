package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,6,6,7,7,1, 0, 1,5};
        //ArrNum qwe = new ArrNum();
        //qwe.ArrNum111(arr);



        System.out.println(ArrNumm(arr));

    }

    static int ArrNumm(int[] in) {

        //boolean stop = false;

        for (int i = 0; i < in.length; i++) {
            //if (in == false)
                for (int j = 0; j < in.length+1; j++) {
                    if ((i == in.length - 1) || (j == in.length)) {
                        //System.out.println(arr[i]);
                        return in[i];
                        //stop = true;
                        //break;
                    }
                    if (i == j)
                        continue;
                    else if (in[i] == in[j])
                        break;
                }
            //else break;
        }
        return 0;
    }



}
