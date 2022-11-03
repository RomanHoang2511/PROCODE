class CoffeeCup {

   int temperature = 75;

   //...

}

class Person {

    static final int tooCold = 65;

    static final int tooHot = 85;

    public void drinkCoffee(CoffeeCup cup) throws  TooColdException, TooHotException {

        int temperature = cup. temperature;

        if (temperature <= tooCold)   throw new TooColdException();

        else if (temperature >= tooHot) throw new TooHotException();

        else System.out.println(temperature +“ is great”);

    }

    //...

    Public static void main(String[] args){

        Person a=new Person();

         a.drinkCoffee(new CoffeeCup());                

   }

}