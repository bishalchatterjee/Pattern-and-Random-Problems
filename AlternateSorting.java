package com.company;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
class AlternateSorting
{

    static void alternateSort(int arr[], int n) {
        Arrays.sort(arr);
        int i = 0, j = n-1;
        while (i < j) {
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }

        if (n % 2 != 0)
            System.out.print(arr[i]);
    }
    public static void main (String[] args)
    {

        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            System.out.println("Enter elements in the array : ");
            int num=sc1.nextInt();
            arr[i]=num;
        }


//                int arr[] = {1, 12,  6, 7, 10};
//                int n = arr.length;
        alternateSort(arr, n);
    }
}
