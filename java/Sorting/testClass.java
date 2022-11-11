/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author owens
 */
public class testClass extends sortingAlgorithms {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int upperBound = 500;
        int input = 4;
        
        System.out.println("How many numbers would you like to sort: ");
        x = scan.nextInt();
        scan.nextLine();
        
        int[] testArray = new int[x];
        
        System.out.println("Which sorting mehtod would you like to test.");
        while(input != 0){
            System.out.println("Enter \"1\" for selection sort, \"2\" for insertion sort, \"3\" for shell sort, or \"0\" to quit: ");
            input = scan.nextInt();
            scan.nextLine();
            
            if(input == 1){
                generateArray(testArray, x);
                System.out.println("Here is your array: ");
                printArray(testArray);
                selectionSort(testArray, testArray.length);
                System.out.println("Testing selection sort.");
                printArray(testArray);
                sortCheck(testArray, testArray.length);
            }
            
            else if(input == 2){
                generateArray(testArray, x);
                System.out.println("Here is your array: ");
                printArray(testArray);
                insertionSort(testArray);
                System.out.println("Testing insertion sort.");
                printArray(testArray);
                sortCheck(testArray, testArray.length);
            }
            
            else if(input == 3){
                generateArray(testArray, x);
                System.out.println("Here is your array: ");
                printArray(testArray);
                shellSort(testArray);
                System.out.println("Testing shell sort.");
                printArray(testArray);
                sortCheck(testArray, testArray.length);
            }
            else{
                break;
            }
        }
        
        
        shellSort(testArray);
        
        System.out.println("Testing selection sort.");
        printArray(testArray);
        sortCheck(testArray, testArray.length);
    }
    private static void generateArray(int [] testArray, int x){
        Random rand = new Random();
        int upperBound = 500;
        for(int i = 0; i < x; i++){
            int randomInt = rand.nextInt(upperBound);
            testArray[i] = randomInt;
        }
    }
    
    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    private static int sortCheck(int[] array, int length){
        if(length == 1 || length == 0){
            System.out.println("Array is sorted!!");
            return 1;
        }
        
        if(array[length - 1] < array[length - 2]){
            System.out.println("Out of order pair: " + array[length - 1] + ", " + array[length - 2]);
            return 0;
        }
        
        return sortCheck(array, length - 1);
    }
}
