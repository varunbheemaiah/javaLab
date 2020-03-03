package javaLab;

import java.util.Arrays;

/**
 * fast
 */
public class fast implements sersor{
    int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
    void qsort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
            qsort(arr, low, pi-1); 
            qsort(arr, pi+1, high); 
        } 
    } 
    public void sort(int[] arr){
        qsort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void search(int[] arr, int key){
        Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int index = Arrays.binarySearch(arr, key);
        if(index >= 0){
            System.out.println("FOUND AT "+(index+1));
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
}