#include <stdio.h>
#include <stdlib.h>
#include <math.h>
void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

 


/* Function to print an array */
void bubbleSort(int arr[], int n)
{
   int i, j;int v;
   int swapped;
   for (i = 0; i < n-1; i++)
   {
     swapped = 0;
     v=i;

     if(v>0){
     printf("\nArray after iteration %d \n", v);
      
      int z;
    for (z=0; z< n; z++)
      {  printf("%d ", arr[z]);
        }}
     for (j = 0; j < n-i-1; j++)
     {
        if (arr[j] > arr[j+1])
        {
           swap(&arr[j], &arr[j+1]);
           swapped = 1;
        }
     }
 
     // IF no two elements were swapped by inner loop, then break
     if (swapped == 0)
        break;
   }
}
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
 
// Driver program to test above functions
int main()
{
    int arr[] = {64, 34, 25, 12, 22, 11, 90, 15, 19, 13, 23, 8, 7, 2, 77};
    int n = sizeof(arr)/sizeof(arr[0]);
    printf("Array before sorting\n");
    printArray(arr, n);
    bubbleSort(arr, n);
    printf("\nFinal Sorted array: \n");
    printArray(arr, n);
    return 0;
}