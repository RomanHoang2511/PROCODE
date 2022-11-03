/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop5.DTO;

/**
 *
 * @author Admin
 */
public class BeeColony extends Colony implements Role{
    private String type;
    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

    public BeeColony(String type, String place) {
        super(place);
        this.type = type;
    }

    public BeeColony(int size, String type , String place) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String toString(){
        return "The colony's type is " + this.type + "Size is about " + super.place;
    }
}
