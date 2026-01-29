//https://codeforces.com/contest/2188/problem/C
import java.util.*;

public class C_Restricted_Sorting
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;

        int tc = sc.nextInt();

        while(tc--> 0) 
        {
            int n = sc.nextInt();

            long[] a = new long[n];

            long[] s = new long[n];

            for(int i = 0; i < n; i++) 
            {
                a[i] = sc.nextLong();

                s[i] = a[i];
            }

            Arrays.sort(s);

            long minVal = s[0];

            long maxVal = s[n - 1];

            long k = Long.MAX_VALUE;

            boolean sorted = true;

            for(int i = 0; i < n; i++) 
            {
                if(a[i] != s[i]) 
                {
                    sorted = false;

                    long diff1 = Math.abs(a[i] - minVal);

                    long diff2 = Math.abs(a[i] - maxVal);

                    long maxDiff = Math.max(diff1, diff2);

                    if(maxDiff < k) 
                    {
                        k = maxDiff;
                    }
                }
            }

            if(sorted) 
            {
                System.out.println(-1);
            } 
            else 
            {
                System.out.println(k);
            }
        }
    }
}
