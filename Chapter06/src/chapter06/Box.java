/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter06;

/**
 *
 * @author Admin
 */
public class Box extends Rectangle {
    int height=0;
    public void set (int l, int w, int h)
    {
        super.setValue(l, w);
        height = h>0? h:0;
        
    }
    public String toString()
    {
        return"[" + length + "," + width + "," + height + "]";
    }
}
