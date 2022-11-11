/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderSystem;

/**
 *
 * @author owens
 */
public class Order {
    private static QueueInterface<orderInformation> orderList = new ArrayQueue<>(10);
    
    public Order(){
        super();
    }
    
    public Order(ArrayQueue<orderInformation> orderList){
        this.orderList = orderList;
    }

    public static QueueInterface<orderInformation> getOrderList() {
        return orderList;
    }

    public static void setOrderList(QueueInterface<orderInformation> orderList) {
        Order.orderList = orderList;
    }
}
