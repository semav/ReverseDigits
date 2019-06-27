package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    static int revertDigits(int x){
        int result = 0;
        int xRemainning = Math.abs(x);

        while(xRemainning != 0){
            result = result * 10 + xRemainning % 10;
            xRemainning /= 10;
        }
        return x > 0 ? result : -result;
    }

    static List<Integer> generatePrimesParallel(int n){
        return IntStream
                .range(2, n+1)
                .parallel()
                .filter(Main::isPrime)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> generatePrimes(int n){
        List<Integer> result = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            if (isPrime(i)){
                result.add(i);
            }
        }

        return result;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0 ){
                return false;
            }
        }
        return true;
    }
}
