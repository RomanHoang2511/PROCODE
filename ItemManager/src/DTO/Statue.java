/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Statue extends Item {
    private int weight;
    private String colour;
    
    public Statue(){}
    public Statue(int weight, String colour, int value, String Creator){
    this.weight=weight;
    this.colour=colour;
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
    public void inputStatue(){
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a weight:");
        weight = sc.nextInt();
        System.out.println("Int put a Colour:");
        colour = sc.nextLine();
    
 }
    public void outputSatue(){
        output();
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
    }
}
