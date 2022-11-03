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
public class Item {
    private int value;
    private String creator;

    public Item(){}
    public Item(int value, String creator){
        this.value=value;
        this.creator=creator;
    }

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
        System.out.println("Input value");
        value = sc.nextInt();
        System.out.println("Input creator");
        creator = sc.nextLine();
        
    }
    public void output(){
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }
}

