/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodDeliveryService;

/**
 *
 * @author owens
 */
public class Product {
    private int customerNumber;
    private String productName;
    private String price;
    
    public Product(int customerNumber, String name, String price){
        this.customerNumber = customerNumber;
        this.productName = name;
        this.price = price;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        String number =" ";
        String name = " ";
        String price =" ";
        String productInfo;
        
        
        number = String.valueOf(getCustomerNumber());
        name = getProductName();
        price = getPrice();
        
        productInfo = number +"\n" + name + "\n" + price + "\n";
        return productInfo;
    }
}
