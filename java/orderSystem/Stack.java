/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderSystem;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author owens
 */
public class Stack<T> implements StackInterface <T>  {
    private T[] stack; 
    private int topIndex;
    private boolean integrityOK;
    private static final int DEFAULT_CAPACITY = 25; 
    private static final int MAX_CAPACITY = 1000; 
    
    public Stack(){
        this(DEFAULT_CAPACITY);
    }
    
    public Stack(int intitialCapacity){
        integrityOK = false; 
        checkCapacity(intitialCapacity);
        
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[])new Object[intitialCapacity];
        stack = tempStack;
        topIndex = -1;
        integrityOK = true;
    }
    
    private void checkCapacity(int capacity){
        if (capacity > MAX_CAPACITY){
            throw new IllegalStateException("Stack size is too large");
        }
    }
    
    private void checkIntegrity(){
        if(!integrityOK){
            throw new SecurityException("Stack is corrupt");
        }
    }
    

    public void push(T newEntry){
        checkIntegrity();
        ensureCapacity();
        stack[topIndex + 1] = newEntry;
        topIndex++;
    }
        
    private void ensureCapacity(){
        if(topIndex == stack.length - 1){
            int newLength = 2 * stack.length;
            checkCapacity(newLength);
            stack = Arrays.copyOf(stack, newLength);
        }
    }
    
    public T pop(){
        checkIntegrity();
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            T top = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
            return top;
        }
    }
    
    public T peek(){
        checkIntegrity();
        if(isEmpty()){
            throw new EmptyStackException();
        }
        
        else{
            return stack[topIndex];
        }
    }
    
    public boolean isEmpty(){
        return topIndex < 0;
    }
    
    public void clear(){
        while(!isEmpty()){
            pop();
            isEmpty();
        }
    }
}
