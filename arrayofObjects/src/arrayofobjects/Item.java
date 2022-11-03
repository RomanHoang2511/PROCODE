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
public class Item {
    //declare fields
    protected int value;
    protected String creator;
    //Constructor
    public Item(){value=0; creator="";}
    public Item(int value, String creator){
    this.value = value;
    this.creator = creator;
    }
    //getters,setter

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value: ");
        value = sc.nextInt();
        System.out.println("Input creator: ");
        creator = sc.nextLine();
        
    }
    public String toString(){
        return this.creator;
    }
    
}

    