/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class Father {
    int x=0;
    void m1() {System.out.println("m1");}
    void m2() {System.out.println("m2");}
    
}
class Son extends Father {
int y=2;
void m2() {System.out.println("m2-overriden");}
}
public class CallOverriddenMethod{
    public static void main(String[] args) {
        Father obj = new Father();
        obj.m1();
        obj.m2();
        obj = new Son();
        obj.m1();
        obj.m2();
    }
}

