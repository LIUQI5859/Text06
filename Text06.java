package com.itheima;

public class Text06 {
    public static void main(String[] args) {

        int[] arr = new int[]{68, 27, 95, 88, 171, 996, 51, 210};

        int sum = 0;
        System.out.println("符合要求的数字分别是：");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 == 0) {
                sum += arr[i];
                System.out.println(arr[i]);
            }
        }
        System.out.println("符合要求的数字的和是：" + sum);
    }
}
