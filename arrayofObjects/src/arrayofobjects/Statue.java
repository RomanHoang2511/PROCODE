/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofobjects;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
    }


    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }
    

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input weight: ");
        weight = sc.nextInt();
        while(weight < 0 && weight > 1000){
        System.out.println("Input weight again: ");
        weight = sc.nextInt();    
        }
        System.out.println("Input colour: ");
        colour = sc.nextLine();
        while(colour == ""){
        System.out.println("Input colour again: ");
        colour = sc.nextLine();    
        }
    }
    public String toString(){
         return colour;
          
}
    }
