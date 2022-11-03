package arrayofobjects;

import java.util.Scanner;

public class antiqueShop {

    private static Object obj;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemList obj = new ItemList();
        //obj.addItem(null)
        int choice = 0;
        do {
            System.out.println("1. add a new vase");
            System.out.println("2. add a new statue");
            System.out.println("3. add a new painting");
            System.out.println("4. display all items");
            System.out.println("5. find the items by the creator ");
            System.out.println("6. update the item by its index");
            System.out.println("7. remove the item by its index");
            System.out.println("8. display the list of vase items ");
            System.out.println("9. sorts items in ascending order based on their values ");
            System.out.println("10. exit");
            System.out.println("input your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Item tmp = new Vase();
                    tmp.input();
                    if (!obj.addItem(tmp)) {
                    }  {
                        System.out.println("added");
                    }
                    break;
                case 2:
                    Item a = new Statue();
                    a.input();
                    if (!obj.addItem(a)) {
                    }  {
                        System.out.println("added");
                    }
                    break;
                case 3:
                    Item scd = new Painting(); 
                    scd.input();
                    if (!obj.addItem(scd)) {
                    }  {
                        System.out.println("added");
                    }
                    break;
                case 4:
                    obj.displayAll();
                    break;
                case 5: 
            {
                String x = null;
                obj.findItem(x);
            }
            }//end switch
                
        } while (choice <= 9);            //end while
    }  //end class

}
