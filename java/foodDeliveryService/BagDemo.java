/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodDeliveryService;

/**
 *
 * @author owens
 */
public class BagDemo{
    public static void main(String[] args){
        BagInterface<Product> cart = new ShoppingCart<>();
        
        Product pro0 = new Product(1, "Variety Pack", "15.99");
        Product pro1 = new Product(2, "Carrots", "4.99");
        Product pro2 = new Product(3, "Strawberries", "2.99");
        Product pro3 = new Product(4, "Lettuce", "3.99");
        
        Product[] products = new Product[4];
        products[0] = pro0;
        products[1] = pro1;
        products[2] = pro2;
        products[3] = pro3;
        
        testAdd(cart, products);
        
    } 
    
    private static void testAdd(BagInterface<Product> cart, Product[] products){
        for(int i = 0; i < products.length; i++){
            if(cart.add(products[i])){
                System.out.println("This product was added: ");
                System.out.println(products[i] + " ");
            }
            else{
                System.out.println("Unable to add");
            }
        }
        displayBag(cart);
    }
    
    private static void displayBag(BagInterface<Product> cart){
        System.out.println("The bag contains these products: ");
        Object[] bagArray = cart.toArray();
        for (int i = 0; i < bagArray.length; i++){
            System.out.println(bagArray[i]);
        }
    }
}
