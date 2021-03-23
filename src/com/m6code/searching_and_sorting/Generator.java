package com.m6code.searching_and_sorting;

import com.m6code.stdlib.StdOut;
import com.m6code.stdlib.StdRandom;

public class Generator {

    public static String randomString(int L, String alpha){
        char[] a = new char[L];
        for(int i = 0; i < L; i++){
            int t = StdRandom.uniform(alpha.length());
            a[i] = alpha.charAt(t);
        }
        return new String(a);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // The Number of words to Generate
        int L = Integer.parseInt(args[1]); // The Length of each word
        String alpha = args[2]; // The String to generate the words from
        for (int i = 0; i<N; i++)
            StdOut.println(randomString(L, alpha));
    }
}
