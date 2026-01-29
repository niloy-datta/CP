// https://codeforces.com/contest/2188/problem/B

import java.io.*;
import java.util.*;
 
public class B_Seats
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
 
        if(!sc.hasNextInt()) return;
 
        int tc = sc.nextInt();
 
        while(tc-- > 0) 
        {
            int n = sc.nextInt();
 
            String s = sc.next();
 
            int res = 0;
 
            for(int i=0; i<n; i++) 
            {
                if(s.charAt(i)=='1') 
                {
                    res++;
                }
            }
 
            int i = 0;
 
            while(i<n) 
            {
                if(s.charAt(i)=='1') 
                {
                    i++;
 
                    continue;
                }
 
                int l = i;
 
                while(i<n && s.charAt(i)=='0') 
                {
                    i++;
                }
 
                int len = i-l;
 
                boolean b = (l==0);
 
                boolean e = (i==n);
 
                if(b&&e) 
                {
                    res += (len+2)/3;
                } 
                else if(b||e) 
                {
                    res += (len+1)/3;
                } 
                else 
                {
                    res += len/3;
                }
            }
 
            System.out.println(res);
        }
    }
}
