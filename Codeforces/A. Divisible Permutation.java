// https://codeforces.com/contest/2188/problem/A
import java.util.*;

public class A_Divisible_Permutation
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0)
        {
            int sz = sc.nextInt();
            int[] val = new int[sz];
            int a = 1;
            int cnt = sz;
            
            for(int i = sz-1; i >= 0; i--)
            {
                if((sz-i) % 2 != 0)
            {
                val[i] = a++;
            }
            else{
                val[i] = cnt--;
            }
        }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<sz ; i++)
            {
            sb.append(val[i]).append(i== sz -1 ? "" : " ");
            
            }
            System.out.println(sb.toString());
    }
    }
}
