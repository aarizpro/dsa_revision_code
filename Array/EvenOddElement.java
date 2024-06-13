import java.util.*;
import java.lang.*;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
	    Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int tc=0; tc<T;tc++){
        int N = scn.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scn.nextInt());
        }
        int diff = checkOddEven(A);
        System.out.println(diff);     
        }
        
	}
    private static int checkOddEven(ArrayList<Integer> list){
       int evenNo = 0;
       int oddNo= 0;
       
       for(int i=0; i<list.size();i++){
           if(list.get(i)%2==0){
               evenNo++;
           }else{
               oddNo++;
           }
       }
       return Math.abs(evenNo-oddNo);
       
    }
}
