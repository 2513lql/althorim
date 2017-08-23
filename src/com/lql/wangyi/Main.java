package com.lql.wangyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by stone on 2017/8/12.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int n = in.nextInt();
            int []x = new int[n];
            int []y = new int[n];
            int []res = new int[n];
            for(int i=0;i<n;i++)
                x[i] = in.nextInt();
            for(int i=0;i<n;i++)
                y[i] = in.nextInt();
            int meanx;
            int meany;
            int maxIndex = -1;
            double sumx = 0;
                double sumy = 0;
                for(int i=0;i<n;i++){
                    sumx+=x[i];
                    sumy+=y[i];
            }
            Set<Integer> set = new HashSet<>();
            for(int j = n-1;j>0;j--)
            {
                if(maxIndex!=-1)
                {
                    sumx-=x[maxIndex];
                    sumy-=y[maxIndex];
                    set.add(maxIndex);
                }
                meanx = (int)Math.round(sumx/(j+1));
                meany = (int)Math.round(sumy/(j+1));
                int temp = 0;
                int max = 0;
                for(int i=0;i<n;i++)
                {
                    if(set.contains(i))
                        continue;
                    int t = Math.abs(x[i]-meanx)+Math.abs(y[i]-meany);
                    if(t>max)
                    {
                        max = t;
                        maxIndex = i;
                    }
                    temp= temp+t;
                }
                res[j] = temp;
            }
            for(int j=0;j<n;j++)
                System.out.print(res[j]+" ");
            System.out.println();
        }
    }
}