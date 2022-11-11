/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderSystem;

/**
 *
 * @author owens
 */
public class orderInformation {
    private String lastName;
    private int orderNumber;
    private float total;
    
    orderInformation(){
        super();
    }
    
    orderInformation(String lastName, int orderNumber, float total){
        this.lastName = lastName;
        this.orderNumber = orderNumber;
        this.total = total;
    } 

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
