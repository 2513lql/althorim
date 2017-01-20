package com.lql.BackTracing;

/**
 * Created by LQL on 2017/1/6.
 */
public class Prime {

    public static int countPrime(int n){

        boolean[] isPrime = new boolean[n];
        int[] primes = new int[n];

        for (int i = 0 ; i < n;i++){
            isPrime[i] = true;
        }
        int count = 0;
        for (int i = 2 ; i < n;i++){
            if (isPrime[i])
                primes[count++] = i;
            for (int j = 0; j < count;j++){
                if (i * primes[j] <= 0 || i * primes[j] >= n){
                    break;
                }
                if (i * primes[j] < n){
                    isPrime[i * primes[j]] = false;
                    if (i % primes[j] == 0) break;
                }
            }
        }
        return count;
    }

    public static int countPrime2(int n){

        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n;i++){

            if (!notPrime[i]){
                count++;
                for (int j = 2 ; j * i < n;j++){
                    notPrime[i * j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrime(2));
    }

}
