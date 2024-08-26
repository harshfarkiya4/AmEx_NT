
public class Main{
    public static void main(String agrs[]){
       try{
         int rem = 5/0;
        System.out.println(rem);
       }
       catch(ArithmeticException e){
        try{
            int rem = 5/0;
        }
        catch(ArithmeticException e2){
            System.out.println("again division by zero");
        }
        finally{
            System.out.println("Nested try-catch exited");
        }
       }
       finally{
        System.out.println("Outer try-catch exited");
       }
    }
}