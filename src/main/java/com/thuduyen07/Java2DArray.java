package com.thuduyen07;

import java.io.*;
import java.util.*;

public class Java2DArray {
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

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for (int h = j; h < j + 3; h++) {
                    for (int k = i; k < i + 3; k++) {
                        if ((h == j + 1 && k == i) || (h == j + 1 && k == i + 2)) {
                            sum += 0;
                        } else {
                            sum += arr.get(h).get(k);
                        }
                    }
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
        bufferedReader.close();


    }
}

/*
Ref. https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
 */