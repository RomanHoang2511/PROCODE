public class Test{
       static final int offset=2;

       public static void demo(int d, int m, int y){

                Integer day=new Integer(d);
                if(day<=31 && m<=12 && m>=1 && y>=1) {

                      Intger year=y+offset;

                      System.out.print(day+"/"+m+"/"+year);

               }

       }

       public static void main(String[] args){

         Test.demo(1,1,2018);

      }

}