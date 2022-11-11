/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderSystem;
import java.util.Scanner;

/**
 *
 * @author owens
 */
public class Main extends Display {
    private static Scanner scan = new Scanner(System.in);
    
    private static void menu(){
        System.out.println("Options");
        System.out.println("-----------------------------");
        System.out.println("1. Add Entry");
        System.out.println("2. Remove Entry");
        System.out.println("3. View order list");
        System.out.println("4. Exit");
    }
    
    private static void sort(){
        fillArrays();
        
        if(getSortByName().length > 0){
            stringQuickSort(getSortByName(), 0, getSortByName().length - 1);
            intQuickSort(getSortByOrder(), 0, getSortByOrder().length - 1);
        
            displayArrays();
        }
        else{
            System.out.println("There are no orders.");
        }
    }
    
    private static orderInformation addElement(String name, int order, float total){
        orderInformation myObj = new orderInformation();
        myObj.setLastName(name);
        myObj.setOrderNumber(order);
        myObj.setTotal(total);
        
        return myObj;  
    }
    
    public static void main(String[] args){
        int userChoice;
        boolean flag = true;
        String tempName = "";
        int tempOrder = 0;
        float tempTotal = 0;
        
        System.out.println("Welcome to the order system.");
        
        while(flag){
            menu();
            System.out.println("Enter the number corresponding to your choice: ");
            userChoice = scan.nextInt();
            scan.nextLine();
            
            switch(userChoice){
                case 1:{
                    System.out.println("What is the last name on the order: ");
                    tempName = scan.nextLine();
                    
                    System.out.println("What is the order number: ");
                    tempOrder = scan.nextInt();
                    scan.nextLine();
                    
                    System.out.println("What is the total: ");
                    tempTotal = scan.nextFloat();
                    scan.nextLine();
                    
                    
                    getOrderList().enqueue(addElement(tempName, tempOrder, tempTotal));
                    
                    sort();
                    
                    break;
                }
                
                case 2:{
                    if(getOrderList().isEmpty()){
                        System.out.println("The queue is empty.");
                    }
                    
                    else{
                        System.out.println("The most recent item will be removed.");
                        getOrderList().dequeue();
                        
                        sort();
                    }
                    
                    break;
                }
                
                case 3: {
                    sort();
                    
                    break;
                }
                
                case 4: {
                    flag = false;
                    
                    break;
                }
                default:{
                    System.out.println("Invalid input try again.");
                    
                    break;
                }
            }
        }
        
        System.out.println("Thank you for using the order system.");
    }
}
