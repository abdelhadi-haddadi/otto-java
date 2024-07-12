

public class exceptions_handling {
    public static void main(String[] args){
        int a = 20 , b = 2;

        try{
            System.out.println(a / b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            //  System.out.println("cannot devode by zero");
        }
        finally {
            System.out.println("this code will be executed in all case");
        }

    }
}
