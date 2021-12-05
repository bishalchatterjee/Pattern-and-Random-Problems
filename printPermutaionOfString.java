package com.company;
class printPermutationOfString
{
    //swap function
    public static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    // Recursive function to generate all permutations of a string

    //approach is to fix one char then swap next chars and recursively call for permutation then swap back to return the original string to parent recursion call stack;
    public static void permutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }

        for (int i = currentIndex; i < chars.length; i++)
        {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }

    public static void findPermutations(String str) {

        // base case
        if (str == null || str.length() == 0) {
            return;
        }

        permutations(str.toCharArray(), 0);
    }

//driver function
    public static void main(String[] args)
    {
        String str = "ABCD";
        findPermutations(str);
    }
}