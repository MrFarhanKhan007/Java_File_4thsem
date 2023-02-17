//import java.math.BigInteger;
//
//public class Experiment2 {
//    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("Usage: java Factorial <number>");
//            return;
//        }
//        int n = Integer.parseInt(args[0]);
//        long long fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//        }
//        System.out.println("Factorial of " + n + " is " + fact);
//    }
//}


//import java.math.BigInteger;
//
//class Experiment2 {
//    public static void main(String[] args) {
//        BigInteger factorial = BigInteger.valueOf(1);
//        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
//            factorial = factorial.multiply(BigInteger.valueOf(i));
//        }
//        System.out.println(factorial);
//    }
//}


//package org.example;

import java.math.BigInteger;

public class Experiment2 {
    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        BigInteger result = factorial(50);
        System.out.println("Factorial: " + result);
}
}
