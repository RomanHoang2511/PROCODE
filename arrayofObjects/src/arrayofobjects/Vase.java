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
public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator) {
        this.height = height;
        this.material = material;
    }
    

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

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height: ");
        height = sc.nextInt();
        while(height < 0 && height > 2000 ){
        System.out.println("Input height again: ");
        height = sc.nextInt();
        }
        System.out.println("Input material: ");
        material = sc.nextLine();  
        while(material == ""){
        System.out.println("Input material again: ");
        material = sc.nextLine();
            
        }
    }
    public String toString(){
        return this.material;
    }
    
    
}
