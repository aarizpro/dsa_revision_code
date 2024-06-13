import java.util.*;
import java.lang.*;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
        int T= scn.nextInt();
        for(int tc=1;tc<=T;tc++)
        {
             int N = scn.nextInt();
             int[] A = new int[N];
             for (int i = 0; i < N; i++)
             {
                A[i] = scn.nextInt();
             }
        
            int B = scn.nextInt();
            boolean ispre = isElePre(A,B);
            System.out.println((ispre?"1":"0"));
        }
	}
    private static boolean isElePre(int[] arr1, int target){
        for(int value:arr1){
            if(value==target){
                return true;
            }
        }
        return false;
    }
}
