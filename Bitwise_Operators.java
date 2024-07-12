public class Bitwise_Operators {
    public static void main(String[] args){
        // kiqaren bite b bite
        int number1 = 10 ; //dec 10 in binary 0000 0000 0000 1010
        int number2 = 12 ; //          binary 0000 0000 0000 1100
        // oper with binary code 1 1 => 1 , 1 0 => 0 ,0 0 => 0
        // and &
        int result = number1 & number2 ; // 1000 binary to dec = 8
        System.out.println(result);
        // or |  1 1 => 1 , 1 0 => 1 ,0 0 => 0
        int result2 = number1 | number2 ; // 1110 binary to dec = 14
        System.out.println(result2);
    }
}



