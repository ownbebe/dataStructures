/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author owens
 */
public class sortingAlgorithms {
    public static void selectionSort(int[] array, int n){
        for(int i = 0; i < n - 1; i++){
            int indexOfSmallest = getIndexofSmallest(array, i, n-1);
            swap(array, i, indexOfSmallest);
        }
    }
    
    private static int getIndexofSmallest(int[] array, int first, int last){
        int min = array[first];
        int indexOfMin = first;
        for(int i = first + 1; i <= last; i++){
            if(array[i] < min){
                min = array[i];
                indexOfMin = i;
            }
        }
        
        return indexOfMin;
    }
    
    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void insertionSort(int[] array){
        int x = array.length;
        for(int i = 1; i < x; i++){
            int key = array[i];
            int j = i - 1;
            
            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
    public static void shellSort(int[] array){
        int x = array.length;
        
        for(int gap = x/2; gap > 0; gap /= 2){
            for(int i = gap; i < x; i++){
                int value = array[i];
                int j = i;
                while(j >= gap && array[j - gap] > value){
                    array[j] = array [j - gap];
                    j -= gap;
                }
                array[j] = value;
            }
        }
    }
    
}
