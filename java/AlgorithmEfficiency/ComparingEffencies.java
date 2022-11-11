/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgorithmEfficiency;

/**
 *
 * @author owens
 */
public class ComparingEffencies {
    public static int findMissing(int[] array){
        int sum1 = 0;
        int sum2 = 0;
        int length = array.length;
        int missing;
        
        for (int i =0; i < length; i++){
            sum1 += array[i];
        }
        
        for (int j = 1; j < length + 2; j++){
            sum2 += j;
        }
        
        missing = sum2 - sum1;
        return missing;  
    }
    public static void main(String[] args){
        int test[] = {6, 4, 1, 3, 5, 7, 8, 9, 10, 11, 12, 13, 14};
        System.out.println(findMissing(test));
        
      
    }
}
