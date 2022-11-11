/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package foodDeliveryService;

/**
 *
 * @author owens
 */
interface BagInterface<T> {
    
    //public int getCurrent();
    
    //public boolean isEmpty();
    
    public boolean add(T newEntry);
    
    //public T remove();
    
    //public boolean remove(T anEntry);
    
    //public void clear();
    
    //public int getFrequencyOf(T anEntry);
    
    //public boolean contain(T anEntry);
    
    public T[] toArray();
    
    
    
    
}
