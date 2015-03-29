package com.company;

public class Main {

    public static int aranjamente(int n, int v) {
        if (v == 1) {
            return n;
        }
        if (v < 1) {
            return 0;
        }
        if (n < 1) {
            return 0;
        }

        if (n < (v * 2 - 1)) {
            return 0;
        }

        int sum = 0;
        for (int i = 2; i <= n - ((v - 1) * 2 - 1); i++) {
            sum += aranjamente(n - i, v - 1);
        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(aranjamente(6, 3));
    }
}
