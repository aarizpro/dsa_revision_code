import java.util.*;
import java.lang.*;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
             int N = scn.nextInt();
             int[] A = new int[N];
             for (int i = 0; i < N; i++)
             {
                A[i] = scn.nextInt();
             }
        
            int B = scn.nextInt();
            int freq = isElePre(A,B);
            System.out.println(freq);
        
	}
    private static int isElePre(int[] arr1, int target){
        int freq=0;
        for(int value:arr1){
            if(value==target){
                freq++;
            }
        }
        return freq;
    }
}
