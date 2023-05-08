package com.cg.listandset;
import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++)
        {
             list.add( scan.nextInt());
        }
        int q = scan.nextInt();
        for(int i=0; i<q;i++)
        {
            String method = scan.next();
            
            if(method.equals("Insert"))
            {
                int index= scan.nextInt();
                int num = scan.nextInt();
                list.add(index, num);
            }
            else if(method.equals("Delete"))
            {
                int index = scan.nextInt();
                list.remove(index);
                
            }
            
        }
        System.out.println(list);
        
    }
}