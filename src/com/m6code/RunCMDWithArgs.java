package com.m6code;

public class RunCMDWithArgs {
    public static void main(String[] args){

        System.out.printf("Hello %s , You are %s old%n", args[0], args[1]);
         StdOut.printf("Hello %s , You are %s old%n", args[0], args[1]);
        // java RunCMDWithArgs Benjamin 18
        // should return
        // Hello Benjamin , You are 18 old

    }
}
