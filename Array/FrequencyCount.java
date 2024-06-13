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
      
        System.out.println(freqCount(A));
	}
    private static ArrayList<Integer> freqCount(ArrayList<Integer> list){
      ArrayList<Integer> result = new ArrayList<>();
       for(int i=0; i<list.size();i++){
           int count =0;
           for(int j=0; j<list.size();j++){
               if(list.get(i).equals(list.get(j))){
                   count++;
               }
           }
           result.add(count);
       }
       return result;
    }
}