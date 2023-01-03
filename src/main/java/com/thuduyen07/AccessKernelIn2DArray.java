package com.thuduyen07;

import java.io.*;
import java.util.*;

// Duyet kernel 3x3 trong mang 2D 6x6

public class AccessKernelIn2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){

                for(int h=j; h<j+3; h++){
                    for(int k=i; k<i+3; k++){
                        System.out.printf("%d ", arr.get(h).get(k));
                    }
                    System.out.printf("\n");
                }
                System.out.println();
            }
        }

        bufferedReader.close();


    }
}
