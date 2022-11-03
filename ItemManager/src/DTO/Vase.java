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
public class Vase extends Item {
    private int height;
    private String material;
    public Vase(){}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    public Vase(int height, String material, int value, String creator ){
    this.height = height;
    this.material= material;
    }
     
        public void inputVase(){
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a height:");
        height = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Input a material:");
        material = sc.nextLine();
    
}
        
 public void outputVase(){
        System.out.println("Height: " + this.height);
        System.out.println("Material: " + this.material);
    }
    }
 