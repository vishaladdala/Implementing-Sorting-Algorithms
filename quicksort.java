import java.io.*;
import java.util.*;

public class quicksort {
  public static void main(String args[])
  {  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int s = sc.nextInt();
    int[] arr = new int[s];
    System.out.println("Enter the elements of the array");       
    for(int i=0;i<s;i++){
         arr[i]=sc.nextInt(); 
    }
  System.out.println("Array before applying quicksort:");
  for(int x:arr)
  System.out.print(x+" ");
  System.out.println();
  System.out.println("Array after applying quicksort:");
  
  qsort(arr,0,arr.length-1);
  for(int x:arr)
    System.out.print(x+" ");
 }


static void qsort(int arr[],int p,int r){
    if(p<r){
      int q = partition(arr,p,r);
      qsort(arr,p,q-1);
      qsort(arr,q+1,r);
    }
  }

static int partition(int arr[],int p,int r){
    int i;
    i = p-1;
    
    for(int j =p;j < r; j++){
      if(arr[j] <= arr[r]){
        i++;
        //exch ai aj
        int mp = arr[i];
        arr[i] = arr[j];
        arr[j] = mp;
      }
    }
    //exh ai+1 ar
    int mp = arr[i+1];
    arr[i+1] = arr[r];
    arr[r] = mp;
    return i+1;
  }
}