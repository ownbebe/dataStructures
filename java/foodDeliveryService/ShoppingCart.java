/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodDeliveryService;

/**
 *
 * @author owens
 */
public final class ShoppingCart<T> implements BagInterface<T> {
    private final T[] cart;
    private int numberOfProducts;
    private static final int DEFAULT_CAPACITY = 25;
    
    public ShoppingCart(){
        this(DEFAULT_CAPACITY);
    }
    
    public ShoppingCart(int desiredCapacity){
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[])new Object[desiredCapacity];
        cart = tempBag;
        numberOfProducts = 0;
    }
    
    public boolean add(T newProduct){
        boolean result = true;
        if(isArrayFull()){
            result = false;
        }
        else{
            cart[numberOfProducts] = newProduct;
            numberOfProducts++;
        }
        return result;
    }
    
    public T[] toArray(){
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfProducts];
        for(int i = 0; i < numberOfProducts; i++){
            result[i] = cart[i];
        }
        return result;
    }
    
    private boolean isArrayFull(){
        return numberOfProducts >= cart.length;
    }
}
