public class do_and_while_loops {
    public static void main(String[] args){

        int counter = 5 ;

        while (counter < 10){
            System.out.println(counter);
            counter++ ;
        }

        do{
            System.out.println(counter);
            counter++ ;
        }
        while(counter < 10);

    }
}
