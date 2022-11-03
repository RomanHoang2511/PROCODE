/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmanager;

/**
 *
 * @author Admin
 */
public class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;
    
    public Car(){
        Colour="";
        EnginePower=0;
        Convertible=false;
        ParkingBrake=false;
    }
    public Car(String Colour, int EnginePower, boolean Convertible, boolean parkingBrake){
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
    public String getColour(){
        return Colour;
    }
    public void setColour(String Colour){
        this.Colour=Colour;
    }   
    public int getEnginePower(){
        return EnginePower;
    }
    public void setEnginePower(int EnginePower){
        this.EnginePower = EnginePower;
    } 
    public boolean getConvertible(){
        return Convertible;
    }
    public void setConvertible(boolean Convertible){
        this.Convertible=Convertible;
    }
    public boolean getParkingBrake(){
        return ParkingBrake;
    }
    public void setParkingBrake(){
        this.ParkingBrake=ParkingBrake;
    }
    
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    public void output(){
        System.out.println("Colour: " + Colour);
        System.out.println("EnginePower: " + EnginePower);
        System.out.println("Convertible: " + Convertible);
        System.out.println("parking brake: " + ParkingBrake);
    }
}

    
