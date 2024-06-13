import java.util.*;
import java.lang.*;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scn.nextInt());
        }
        int B = scn.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        for(int val:A){
            res.add(val+B);
        }
         System.out.println("Input Array: " +A);
         System.out.println("Output Array: " +res);
	}
}