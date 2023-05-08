package com.cg.collectors.groupingBy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++)
        {
            int c = scan.nextInt();
            
            switch(c)
            {
                case 1:
                int num = scan.nextInt();
                if(num%2 !=0)
                System.out.println("EVEN");
                break;
                
                case 2:
                int num1 = scan.nextInt();
                int count =0;
               for(int j=1; j<= num1; j++)
               {
                   if(num1%j == 1)
                   count++;
                   
               }
               if(count==2)
               System.out.println("PRIME");
               break;
               
               case 3:
               int num2 = scan.nextInt();
               int temp = num2;
               int rev =1;
               while(num2 >0)
               {
                   int r = num2%10;
                   rev = rev *10 +r;
                   num2 = num2/10;
               }
               if(rev == temp)
               System.out.println("PALINDROME");
               break;
            }
        }
    }
}
