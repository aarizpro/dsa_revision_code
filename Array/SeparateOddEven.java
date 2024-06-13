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
        checkOddEven(A);   
        }
        
	}
    private static void checkOddEven(ArrayList<Integer> list){
      ArrayList<Integer> oddNo = new ArrayList<>();
      ArrayList<Integer> evenNo = new ArrayList<>(); 
       for(int i=0; i<list.size();i++){
           if(list.get(i)%2==0){
               evenNo.add(list.get(i));
           }else{
               oddNo.add(list.get(i));
           }
       }
        printArrayList(oddNo);
         printArrayList(evenNo);
       
    }
    private static void printArrayList(ArrayList<Integer> list) {
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
