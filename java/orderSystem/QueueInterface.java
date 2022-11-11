/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package orderSystem;

/**
 *
 * @author owens
 */
public interface QueueInterface <T> {
    public void enqueue(T newEntry);
    
    public T dequeue();
    
    public T getFront();
    
    public boolean isEmpty();
    
    public void clear();
}
