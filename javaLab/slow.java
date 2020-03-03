package javaLab;

/**
 * slow
 */
public class slow implements sersor{
    public void search(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("FOUND AT POSITION "+(i+1));
                return;
            }
        }
        System.out.println("NOT FOUND");
    }    
    public void sort(int[] arr){
        int temp;
        boolean swapped = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                }
            }
            if (swapped == false) 
                break; 
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}