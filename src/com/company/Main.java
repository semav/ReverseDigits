package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int revertDigits(int x){
        int result = 0;
        int xRemainning = Math.abs(x);

        while(xRemainning != 0){
            result = result * 10 + xRemainning % 10;
            xRemainning /= 10;
        }
        return x > 0 ? result : -result;
    }
}
