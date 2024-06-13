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
        System.out.println(pairCount(A,B));
	}
    private static int pairCount(ArrayList<Integer> list,int B){
     int count =0;
       for(int i=0; i<list.size();i++){
           for(int j=i+1; j<list.size();j++){
               if(list.get(i)+list.get(j)==B){
                   count++;
               }
           }
        }
       return count;
    }
}