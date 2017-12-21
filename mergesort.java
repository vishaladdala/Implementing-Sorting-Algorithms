import java.io.*;
import java.util.*;

public class mergesort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i< s; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array before sorting");
        for(int x: arr){
            System.out.print(x + "  ");
        }
        System.out.println();
        
        mergesort(arr,0,arr.length-1);
        System.out.println("Array after with mergesort technique:");
        for(int x: arr){
            System.out.print(x + "  ");
        }
    }

    static void merge(int a[],int p,int q,int r){
	    int b[] = new int[r+1];
	    for(int i = p;i <= r;i++){
	      b[i] = a[i];
	    }  
	    int i = p; int j = q+1;
	    for(int k=p;k <= r;k++){
	      if(j > r || (i <= q && b[i] <= b[j]))
	        a[k] = b[i++];
	      else
	        a[k] = b[j++];
	    }
	  }
	
	  
	  static void mergesort(int[] arr, int p, int r){
		  if(p < r){
			  int q = (p+r)/2;
			  mergesort(arr,p, q);
			  mergesort(arr, q+1,r);
			  
			  merge(arr, p, q,r);
			  }
      }
}

