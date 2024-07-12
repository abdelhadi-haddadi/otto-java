public class strings_manipulation {
    public static void main(String[] args){

        String str = "    this is string   ";
        // length()
        String lower = str.toLowerCase();
        String upper = str.toUpperCase();
        String strnew = str.substring(1,5); // 'his '
        String cnt = str.concat("this new s from java");
        String test = str.replace("his" ,"ddd");
        String trim = str.trim(); // remove white space
        System.out.println(str.contains("z"));
        String strNum = "10";
        // note : char is number unicode 
        int a = 2 + Integer.parseInt(strNum);
        System.out.println(a);

    }
}
