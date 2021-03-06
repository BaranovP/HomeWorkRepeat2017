package HomeWork2;

import HomeWork6.ArraysUtils;

import java.util.Arrays;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class Task2_1{
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        double[] arr2 = new double[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = (int) ((Math.random() - 0.5) * 100);
        }
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < 10; i++) {
            arr2[i] = (Math.random() - 0.5) * 100;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        ArraysUtils.sum(arr1);
        ArraysUtils.sum(arr2);
        System.out.println();
        ArraysUtils.min(arr1);
        ArraysUtils.min(arr2);
        System.out.println();
        ArraysUtils.max(arr1);
        ArraysUtils.max(arr2);
        System.out.println();
        ArraysUtils.maxPositive(arr1);
        ArraysUtils.maxPositive(arr2);
        System.out.println();
        ArraysUtils.multiplication(arr1);
        ArraysUtils.multiplication(arr2);
        System.out.println();
        ArraysUtils. modulus(arr1);
        ArraysUtils.modulus(arr2);
        System.out.println();
        ArraysUtils.secondLargest(arr1);
        ArraysUtils.secondLargest(arr2);
        System.out.println();
        ArraysUtils.reverse(arr1);
        ArraysUtils.findEvenElements(arr1);


    }

//    static void sum(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//    }
//
//    static void sum(double[] arr) {
//        double sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//    }
//
//    static void min(int[] arr) {
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min)
//                min = arr[i];
//        }
//        System.out.println(min);
//    }
//
//    static void min(double[] arr) {
//        double min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min)
//                min = arr[i];
//        }
//        System.out.println(min);
//    }
//
//    static void max(int[] arr) {
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max)
//                max = arr[i];
//        }
//        System.out.println(max);
//    }
//
//    static void max(double[] arr) {
//        double max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max)
//                max = arr[i];
//        }
//        System.out.println(max);
//    }
//
//    static void maxPositive(int[] arr) {
//        int positive = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                positive = arr[i];
//                break;
//            }
//        }
//        if (positive < 0) {
//            System.out.println("There is no positive elements in array");
//            System.exit(0);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0 && arr[i] > positive)
//                positive = arr[i];
//        }
//        System.out.println(positive);
//    }
//
//    static void maxPositive(double[] arr) {
//        double positive = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                positive = arr[i];
//                break;
//            }
//        }
//        if (positive < 0) {
//            System.out.println("There is no positive elements in array");
//            System.exit(0);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0 && arr[i] > positive)
//                positive = arr[i];
//        }
//        System.out.println(positive);
//    }
//
//
//    static void multiplication(int[] arr) {
//        long mult = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            mult = mult * arr[i];
//        }
//        System.out.println(mult);
//    }
//
//    static void multiplication(double[] arr) {
//        double mult = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            mult = mult * arr[i];
//        }
//        System.out.println(mult);
//    }
//
//    static void modulus(int[] arr) {
//        if (arr[0] < 0 || arr[0] < arr[arr.length - 1] || arr[arr.length - 1] < 0)
//            System.out.println(0);
//        else
//            System.out.println(arr[0] % arr[arr.length - 1]);
//    }
//
//    static void modulus(double[] arr) {
//        if (arr[0] < 0 || arr[0] < arr[arr.length - 1] || arr[arr.length - 1] < 0)
//            System.out.println(0);
//        else
//            System.out.println(arr[0] % arr[arr.length - 1]);
//    }
//
//    static void secondLargest(int[] arr) {
//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//        System.out.println(arr[arr.length - 2]);
//    }
//
//    static void secondLargest(double[] arr) {
//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//
//                if (arr[j] > arr[j + 1]) {
//                    double tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//        System.out.println(arr[arr.length - 2]);
//    }
}