// Reading Input 
import  java.util.Scanner ;
public class Book {


    public static  void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        String name = "abdelahdi haddadi";
      
        float a,b ;
      
        System.out.println("Entrer un nombre : ");
        a = sc.nextFloat();
      
        System.out.println("Entrer un nombre : ");
        b = sc.nextFloat();

        System.out.println("my number is : " + (a + b));
        System.out.println("my num is " + a + " " + b);
      
    }
}
