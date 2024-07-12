public class methods {
    public static void main(String[] args){
        // methods
        // showMessage();
        // SayHello("abdelhadi");
       int sum = add(199,23);
       System.out.println(sum);
    }
    static void showMessage(){
        System.out.println("Salam");
    }
    static void SayHello(String name){
        System.out.println("Welcome :"+ name);
    }

    static  int add(int a , int b){
        int sum = a + b ;
        return sum;
    }
}
