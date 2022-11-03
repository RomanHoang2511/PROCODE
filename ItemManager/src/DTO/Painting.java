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
public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    
    public Painting(){}
    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed ){
    this.height=height;
    this.width=width;
    this.isWatercolour=isWatercolour;
    this.isFramed=isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void inputPainting(){
    input();
    Scanner sc = new Scanner(System.in);
        System.out.println("Intput height:");
        height = sc.nextInt();
        System.out.println("Input width:");
        width = sc.nextInt();
        System.out.println("Input isWatercolour (True/False)");
        isWatercolour = sc.nextBoolean();
        System.out.println("Input isFramed (True/False)");
        isFramed = sc.nextBoolean();
    }
    public void outputPainting(){
        output();
        System.out.println("Height:" + this.height);
        System.out.println("Width:" + this.width);
        System.out.println("isWatercolour:" + this.isWatercolour);
        System.out.println("isFramed:" + this.isFramed);
    }
}
