/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Television implements VNRemote {
    public 

    @Override
    public void onDevice() {
        System.out.println("on TV"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void offDevice() {
        System.out.println("off TV");    }
    public static void main(String[] args){
        VNRemote remote=new Television();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        VNRemote.setTimer(10000);
        System.out.println("TV remote's price:" + VNRemote.price);
        System.out.println("TV Remote has: " +VNRemote.MAXofButtons + "buttons");
        
    }
    
}
