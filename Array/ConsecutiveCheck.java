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
        System.out.println(consecCheck(A));
	}
    private static boolean consecCheck(ArrayList<Integer> list){
     
       for(int i=1; i<list.size();i++){
               if(list.get(i)==list.get(i-1)){
                   return true;
               }
             }
       return false;
    }
}