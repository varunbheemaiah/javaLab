package javaLab;

import java.util.Arrays;

/**
 * fast
 */
public class fast implements sersor{
    public void sort(int[] arr){
        Arrays.sort(arr);
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