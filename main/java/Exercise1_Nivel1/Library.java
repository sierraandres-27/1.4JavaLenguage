package Exercise1_Nivel1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private ArrayList<Book>books;

    public Library(){

        this.books=new ArrayList<Book>();

    }




    public  void add_book ( String title_p){

        books.add(new Book(title_p));

    }

    /*public  String get_thewhole_list (){

        return books.toString();

    }*/

    public List<Book> get_thewhole_list(){

        return new ArrayList<>(books);


    }

    public  String get_specific_title (int position){

        return books.get(position).getTitle();
    }

    public  void add_specific_position (int position, String title_p ){

        Book book =new Book(title_p);

        books.set(position,book);

    }

    public void remove_specific_position (int position){

       books.remove(position);

    }



}
