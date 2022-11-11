/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderSystem;

/**
 *
 * @author owens
 */
public class Display extends Order {
    private static StackInterface<orderInformation> orders = new Stack<>();
    private static int queueLength;
    private static orderInformation[] sortByName;
    private static orderInformation[] sortByOrder;
    private static orderInformation[] temp;
    
    public static void fillArrays(){
        orderInformation myObj = new orderInformation();
        int counter = 0;
        temp = new orderInformation[1000];
        
        while(!getOrderList().isEmpty()){
            myObj = getOrderList().dequeue();
            temp[counter] = myObj;
            orders.push(myObj);
            counter ++;
        }
        
        while(!orders.isEmpty()){
            getOrderList().enqueue(orders.pop());
        }
        
        queueLength = counter;
        sortByName = new orderInformation[queueLength];
        sortByOrder = new orderInformation[queueLength];
        
        for(int i = 0; i < queueLength; i++){
            myObj = temp[i];
            sortByName[i] = myObj;
            sortByOrder[i] = myObj;
        }
    }

    public static orderInformation[] getSortByName() {
        return sortByName;
    }

    public static void setSortByName(orderInformation[] sortByName) {
        Display.sortByName = sortByName;
    }

    public static orderInformation[] getSortByOrder() {
        return sortByOrder;
    }

    public static void setSortByOrder(orderInformation[] sortByOrder) {
        Display.sortByOrder = sortByOrder;
    }
    
    public static void swap(orderInformation[] array, int i, int j){
        orderInformation temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static int stringPartition(orderInformation[] array, int low, int high){
        String pivot = array[high].getLastName();
        int i = (low - 1);
        
        for(int j = low; j < high; j++){
            if(array[j].getLastName().compareToIgnoreCase(pivot) > 0){
                i++;
                
                orderInformation temp = new orderInformation();
                
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        orderInformation temp = new orderInformation();
        
        temp = array[i+1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
    }
    
    public static void stringQuickSort(orderInformation[] array, int low, int high){
        if(low < high){
            int par = stringPartition(array, low, high);
            
            stringQuickSort(array, low, par - 1);
            stringQuickSort(array, par + 1, high);
        }
    }
    
    public static int intPartition(orderInformation[] array, int low, int high){
        int pivot = array[high].getOrderNumber();
        int i = (low - 1);
        for(int j = low; j < high; j++){
            if(array[j].getOrderNumber() >= pivot){
                i++;
                
                orderInformation temp = new orderInformation();
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        orderInformation temp = new orderInformation();
        temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
    }
    
      public static void intQuickSort(orderInformation[] array, int low, int high){
        if(low < high){
            int par = intPartition(array, low, high);
            
            intQuickSort(array, low, par - 1);
            intQuickSort(array, par + 1, high);
        }
    }
      
    public static void displayArrays(){
        for(int j = 0; j < sortByName.length; j++) {
            System.out.println("Last name " + (j + 1) + ":");
            System.out.println("--------------");
            System.out.println("Last name: " + sortByName[j].getLastName());
            System.out.println("Order number: " + String.valueOf(sortByName[j].getOrderNumber()));
            System.out.println("Total: " + String.valueOf(sortByName[j].getTotal()));
            System.out.println("");
        }
        
        for(int j = 0; j < sortByOrder.length; j++) {
            System.out.println("Order number " + (j + 1) + ":");
            System.out.println("--------------");
            System.out.println("Last name: " + sortByOrder[j].getLastName());
            System.out.println("Order number: " + String.valueOf(sortByOrder[j].getOrderNumber()));
            System.out.println("Total: " + String.valueOf(sortByOrder[j].getTotal()));
            System.out.println("");
        }
    }
}
