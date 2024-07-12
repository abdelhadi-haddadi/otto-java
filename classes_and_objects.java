public class classes_and_objects {
    public static void main(String[] args){

        Booka book  = new Booka();

        book.id = 1;
        book.Title = "blabla";
        book.Author ="adnane ibrahim";
        book.nbr_page = 200 ;

        System.out.println("id = "+book.id);
        System.out.println("Title = "+book.Title);
        System.out.println("Author = "+book.Author);
        System.out.println("nbr_page = "+book.nbr_page);
    }
}



class Booka {
    // Fields
    int id ;
    String Title ;
    String Author ;
    int nbr_page ;
}
