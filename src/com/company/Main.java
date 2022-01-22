package com.company;
import java.util.Arrays;

public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    public static void main(String[] args) {
    //задание 1
    int[] arr = generateRandomArray();
    int spending = 0;
    for (int a: arr) {
        spending += a;
    }
        System.out.println("сумма трат за месяц составила " + spending + " рублей.");

    //задание 2

        int maxSpending = arr[0];
        int minSpending = arr[0];
        for (int b :arr) {
            if (b > maxSpending) {
                maxSpending = b;
            }
            if (b < minSpending) {
                minSpending = b;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. максимальнасумма трат за день составила " + maxSpending + " рублей.");
    //задание 3
        float middleSpending = spending / (float) arr.length;
           System.out.println("средняя сумма трат за месяц составила " + middleSpending + " рублей");
    //задание 4
        char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length -1; i >= 0; i--) {
            System.out.print(reversFullName[i]);
        }
    }
}



