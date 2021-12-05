package com.company;

import java.util.Scanner;
class GCD {
    public static int gcd(int n, int x) {
        int no=0;
        var c = 0;
        if (n > x)
            c = n;
        else
            c = x;
        for (int i = c; i >= 1; i--) {
            if (n % i == 0 && x % i == 0) {
                no = i;
                break;
            }
        }
        return no;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers");
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println("GCD is : "+gcd(n, x));
    }
}







