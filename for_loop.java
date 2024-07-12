import java.util.Scanner;

public class for_loop {
    public static void main(String[] args){
//        for (int i = 0 ; i < 10 ; i++){
//            System.out.println("Message :" +i);
//        }
        Scanner sc = new Scanner(System.in);
        int mark ;
        int sum = 0 ;
        for (int count = 0 ; count < 5 ; count++) {
            System.out.println("Enter The Mark "+ count);
            mark = sc.nextInt();
            sum += mark ;

        }
        System.out.println("Average is : " +  (sum / 5));
    }
}
