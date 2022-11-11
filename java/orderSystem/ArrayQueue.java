/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderSystem;
import java.io.IOException;


/**
 *
 * @author owens
 */
public class ArrayQueue<T> implements QueueInterface<T> {
    private T[] queue;
    private int frontIndex;
    private int backIndex;
    private boolean integrityOK;
    private static final int DEFAULT_CAPACITY = 50;
    private static final int MAX_CAPACITY = 1000;
    
    public ArrayQueue(){
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayQueue(int initialCapacity){
        integrityOK = false;
        checkCapacity(initialCapacity);
        
        @SuppressWarnings("unchecked")
        T[] tempQueue = (T[]) new Object[initialCapacity + 1];
        queue = tempQueue;
        frontIndex = 0;
        backIndex = initialCapacity;
        integrityOK = true;
    }
    
    public void enqueue(T newEntry){
        checkIntegrity();
        ensureCapacity();
        backIndex = (backIndex + 1) % queue.length;
        queue[backIndex] = newEntry;
    }
    
    public T getFront(){
        checkIntegrity();
        if(isEmpty()){
            throw new IllegalStateException("Empty queue.");
        }
        
        else{
            return queue[frontIndex];
        }
    }
    
    public T dequeue(){
        checkIntegrity();
        if(isEmpty()){
            throw new IllegalStateException("Empty queue.");
        }
        
        else{
            T front = queue[frontIndex];
            queue[frontIndex] = null;
            frontIndex = (frontIndex + 1) % queue.length;
            return front;
        }
    }
    
    private void ensureCapacity(){
        if(frontIndex == ((backIndex + 2) % queue.length)){
            T[] oldQueue = queue;
            int oldSize = oldQueue.length;
            int newSize = 2 * oldSize;
            checkCapacity(newSize - 1);
            integrityOK = false;
            
            @SuppressWarnings("unchecked")
            T[] tempQueue = (T[]) new Object[newSize];
            queue = tempQueue;
            for(int i = 0; i < oldSize - 1; i++){
                queue[i] = oldQueue[frontIndex];
                frontIndex = (frontIndex + 1) % oldSize;
            }
            frontIndex = 0;
            backIndex = oldSize - 2;
            integrityOK = true;
        }
    }
    
    public boolean isEmpty(){
        checkIntegrity();
        return frontIndex == ((backIndex + 1) % queue.length);
    }
    
    public void clear(){
        for(int i = 0; i < queue.length; i++){
            queue[i] = null;
        }
    }
    
    private void checkCapacity(int capacity){
        if(capacity > MAX_CAPACITY){
            throw new IllegalStateException("Queue too big.");
        }
    }
    
    private void checkIntegrity(){
        if(!integrityOK){
            throw new SecurityException("Security compromised.");
        }
    }
}
