/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5;
import java.util.Scanner;

/**
 *
 * @author owens
 */
public class backwardsArray {
    private static int x = 0;
    private static int iterations = 0;
    
    
    public static void getLength(int[] array){
        int input;
        Scanner scan = new Scanner(System.in);
        x = array.length;
        System.out.println("The array is " + x + " elements long.");
        System.out.println("How many elements would you like displayed backwards: ");
        
        input = scan.nextInt();
        scan.nextLine();
        
        if(input > x || input < 0){
            System.out.println("Invalid amount. Exiting");
        }
        else{
            backwards(array, x, input);
        }
    }
    public static void backwards(int[] n, int x, int amount){
        int z;
        
        if(x > 0 && iterations < amount){
            z = x - 1;
            System.out.println(n[z]);
            iterations += 1;
            backwards(n, z, amount);
        }
    }
}
