import java.io.*;
import java.util.*;

public class InsertionSort{

    public static void insertionSort(int[] ar)
    {       
        int n = 2;
        while(n <= ar.length){
            int val = ar[n-1];
            int i;
            for(i=n-2;i>=0 && val < ar[i];i--){
                ar[i+1] = ar[i];
            }
            ar[i+1]=val;
            //printArr(ar);
       n++;
        }
        printArr(ar);
        
    }  
    
       
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int s = sc.nextInt();
       int[] ar = new int[s];
       System.out.println("Enter the elements of the array");       
       for(int i=0;i<s;i++){
            ar[i]=sc.nextInt(); 
       }
       insertionSort(ar);    
                    
    }    
    private static void printArr(int[] ar) {
      for(int x: ar){
         System.out.print(x + " ");
      }
        System.out.println("");
   }
}