package com.company;
import java.util.*;
//        0
//        1*
//        2**
//        3***
//        4****
//        5*****

public class pattern2 {
    // Function implementation
    static void pattern(int no_line) {
        int c = 0;
        for (int i = 1; i <= no_line; i++) {
            System.out.print(i - 1);
            for (int j = 1; j <= i - 1; j++) {
                if (i == 1)
                    continue;
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int no_line = sc.nextInt();

        pattern(no_line);
    }
}


        //Normal code

//       int no_line =6,c=0;
//       for(int i=1;i<=no_line;i++)
//       {
//           System.out.print(i-1);
//           for(int j=1;j<=i-1;j++)
//           {
//               if(i==1)
//               continue;
//                   System.out.print("*");
//           }
//           System.out.println();
//       }






