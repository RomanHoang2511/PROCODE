/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3;

/**
 *
 * @author Admin
 */
public class Guitar {
    
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;
    public Guitar(){
        serialNumber="";
        price=0;
        builder=""; 
        model="";
        backWood="";
        topWood="";
    }
    
    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood ){
        this.serialNumber=serialNumber;
        this.price=price;
        this.builder=builder;
        this.model=model;
        this.backWood=backWood;
        this.topWood=topWood;
    }
    public String getserialNumber(){
        return serialNumber;
    }
    public int getprice(){
        return price;
    }
    public String getbuilder(){
        return builder;
    }
    public String getmodel(){
        return model;
    }
    public String backWood(){
        return backWood;
    }
    public String topWood(){
        return topWood;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }
    public void createSound(){
        System.out.println("SerialNumber: "+ this.serialNumber);
        System.out.println("Price: "+ this.price);
        System.out.println("Builder: " + this.builder );
        System.out.println("Model: " + this.model);
        System.out.println("BackWood: "+ this.backWood);
        System.out.println("TopWood: "+ this.topWood);
        
    }
}
    
