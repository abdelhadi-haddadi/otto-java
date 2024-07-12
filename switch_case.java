public class switch_case {
    public static void main(String[] args){
        int grade = 20 ;
        switch(grade){
            case 20:
                System.out.println("Excellent Grade");
                break;
            case 10:
                System.out.println("Good Grade");
                break;
            case 5:
                System.out.println("Low Grade");
                break;
            default:
                System.out.println("Unknown Grade");
        }
    }
}
