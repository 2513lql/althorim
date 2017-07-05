package com.lql.contest;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] res = new int[n];
        int k = 0;
        int m = n;
        while(n--!=0)
        {
            int t = in.nextInt();
            Set<Set<Integer>> set = new HashSet<Set<Integer>>();
            int []nums = new int[t];
            for(int i=0;i<t;i++)
                nums[i] = in.nextInt();
            res[k++] = triplet(nums);
        }
        for (int i = 0;i < m; i++){
            System.out.println(res[i]);
        }
    }

    public static int triplet(int[] nums){
        int sum = 0;
        Set<Set<Integer>> set = new HashSet<Set<Integer>>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                    continue;
                for(int k =j+1;k<nums.length;k++)
                {
                    if(nums[j]+nums[k]+nums[i]==0)
                    {
                        Set temp = new HashSet();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        if(set.add(temp))
                        {
                            int a = nums[j]%1000000007;
                            int b = nums[i]%1000000007;
                            int c = nums[k]%1000000007;
                            a = (a*a)%1000000007;
                            b = (b*b)%1000000007;
                            c = (c*c)%1000000007;
                            a = (a+b+c)%1000000007;
                            sum = (sum+a)%1000000007;
                        }
                    }
                }
            }
        }
        return sum;
    }
}