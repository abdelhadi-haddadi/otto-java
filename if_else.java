import java.util.Scanner ;
public class if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNumber = 15 ;
        int yourNumber ;

        System.out.println("Guess Number :");
        yourNumber = sc.nextInt();

        if(yourNumber > myNumber){
            // instructions
            System.out.println("Higher");
        }else if(yourNumber < myNumber){
            // instructions
            System.out.println("Lower");

        }else {
            System.out.println("Equal");
        }
    }
}
