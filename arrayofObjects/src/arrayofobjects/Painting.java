/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofobjects;

import arrayofobjects.Item;
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

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
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
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height: ");
        height = sc.nextInt();
        System.out.println("Input width: ");
        width = sc.nextInt();
        System.out.println("isWatercolour? ( True/ False)");
        isWatercolour = sc.nextBoolean();
        System.out.println("isFramed? ( True/ False)");
        isFramed = sc.nextBoolean();
    }
    public String toString(){
        return null;
    }
}
