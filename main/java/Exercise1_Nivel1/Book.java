package Exercise1_Nivel1;

import java.util.ArrayList;
import java.util.Objects;

public class Book implements Comparable<Book>{

    private String title;

    public Book (String title_p){


        title=title_p;


    }

    public String getTitle(){

        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }


    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
