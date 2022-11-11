/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postfixConverter;

/**
 *
 * @author owens
 */
public class postfixTest extends postfixConverter{
    public static void main(String[] args){
        System.out.println(convertToPostfix("(a + b + c) * d*e/f"));//equations should not include spaces, and variables are assumed to be non-operator characters
    }
    
}
