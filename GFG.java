package com.company;

public class GFG{
    static int checkEqualSumUtil(int arr[], int N, int sm1, int sm2, int sm3, int j)
    {
        if (j == N)
        {
            if (sm1 == sm2 && sm2 == sm3)
                return 1;
            else
                return 0;
        }
        else
        {
            int l = checkEqualSumUtil(arr, N, sm1 + arr[j], sm2, sm3, j + 1);
            int m = checkEqualSumUtil(arr, N, sm1, sm2 + arr[j], sm3, j + 1);
            int r = checkEqualSumUtil(arr, N, sm1, sm2, sm3 + arr[j], j + 1);
            return Math.max(Math.max(l, m), r);
        }
    }
    static void checkEqualSum(int arr[], int N)
    {
        int sum1, sum2, sum3;
        sum1 = sum2 = sum3 = 0;
        if (checkEqualSumUtil(arr, N, sum1, sum2, sum3, 0) == 1)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {6,4,5,5,10,0};
        int N = arr.length;
        checkEqualSum(arr, N);
    }
}
