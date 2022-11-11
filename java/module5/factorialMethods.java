/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5;

/**
 *
 * @author owens
 */
public class factorialMethods {
    public static int method1(int x){
        if(x == 0){
            return 1;
        }
        else{
            return(x * method1(x -1));        
        }
    }
    
    public static int method2(int y){
        if(y == 0 || y == 1){
            return 1;
        }
        
        return(y * method2(y - 1));
    }
}
